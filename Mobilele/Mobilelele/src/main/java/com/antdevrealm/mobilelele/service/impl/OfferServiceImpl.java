package com.antdevrealm.mobilelele.service.impl;

import com.antdevrealm.mobilelele.model.dto.AddOfferDTO;
import com.antdevrealm.mobilelele.model.dto.OfferDetailsDTO;
import com.antdevrealm.mobilelele.model.entity.Offer;
import com.antdevrealm.mobilelele.repository.OfferRepository;
import com.antdevrealm.mobilelele.service.OfferService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    private final ModelMapper modelMapper;

    public OfferServiceImpl(OfferRepository offerRepository, ModelMapper modelMapper) {
        this.offerRepository = offerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public long createOffer(AddOfferDTO addOfferDTO) {
        return offerRepository.save(mapToOffer(addOfferDTO)).getId();
    }

    @Override
    public OfferDetailsDTO getOfferDetails(long id) {
        Optional<Offer> offerById = offerRepository.findById(id);

        if(offerById.isEmpty()) {
            throw new EntityNotFoundException("offer with id " + id + " not found!");
        }

        return mapToDetailsDTO(offerById.get());

    }

    private Offer mapToOffer(AddOfferDTO addOfferDTO) {
        return modelMapper.map(addOfferDTO, Offer.class);
    }

    private OfferDetailsDTO mapToDetailsDTO (Offer offer) {
        return modelMapper.map(offer, OfferDetailsDTO.class);
    }
}
