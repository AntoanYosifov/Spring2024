package com.antdevrealm.mobilelele.repository;

import com.antdevrealm.mobilelele.model.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository <Offer, Long> {


}
