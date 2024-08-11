package com.antdevrealm.mobilelele.service;

import com.antdevrealm.mobilelele.model.dto.AddOfferDTO;
import com.antdevrealm.mobilelele.model.dto.OfferDetailsDTO;

public interface OfferService {

    long createOffer(AddOfferDTO addOfferDTO);

    OfferDetailsDTO getOfferDetails(long id);
}
