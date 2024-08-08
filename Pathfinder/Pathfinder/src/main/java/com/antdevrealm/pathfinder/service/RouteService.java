package com.antdevrealm.pathfinder.service;

import com.antdevrealm.pathfinder.model.dto.RouteShortInfoDTO;

import java.util.List;


public interface RouteService {

    RouteShortInfoDTO getRandomRoute();
    List<RouteShortInfoDTO> getAllRoutes();
}
