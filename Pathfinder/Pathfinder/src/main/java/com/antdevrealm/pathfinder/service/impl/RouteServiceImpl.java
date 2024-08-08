package com.antdevrealm.pathfinder.service.impl;

import com.antdevrealm.pathfinder.model.dto.RouteShortInfoDTO;
import com.antdevrealm.pathfinder.model.enitty.Picture;
import com.antdevrealm.pathfinder.model.enitty.Route;
import com.antdevrealm.pathfinder.repository.RouteRepository;
import com.antdevrealm.pathfinder.service.RouteService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private Random random;
    private final ModelMapper modelMapper;


    public RouteServiceImpl(RouteRepository routeRepository, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.modelMapper = modelMapper;
        this.random = new Random();
    }
    @Transactional
    @Override
    public List<RouteShortInfoDTO> getAllRoutes() {
        List<Route> allRoutes = routeRepository.findAll();
        return allRoutes.stream().map(this::mapToShortInfoDTO).toList();
    }


    @Transactional
    @Override
    public RouteShortInfoDTO getRandomRoute() {
        long routeCount = routeRepository.count();

        long randomId = random.nextLong(routeCount) + 1;

        Optional<Route> routeById = routeRepository.findById(randomId);

        if (routeById.isEmpty()) {
            throw new EntityNotFoundException("Route with " + randomId + " not found!");
        }
        Route route = routeById.get();

        return mapToShortInfoDTO(routeById.get());

    }

    private RouteShortInfoDTO mapToShortInfoDTO(Route route) {

        Optional<Picture> picture = route.getPictures().stream().findFirst();
        RouteShortInfoDTO shortInfoDTO = modelMapper.map(route , RouteShortInfoDTO.class);

        shortInfoDTO.setImageUrl(picture.get().getUrl());
        return shortInfoDTO;
    }
}
