package com.antdevrealm.mobilelele.web;

import com.antdevrealm.mobilelele.model.dto.OfferDetailsDTO;
import com.antdevrealm.mobilelele.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/offers")
public class OfferDetailsController {

    private final OfferService offerService;

    public OfferDetailsController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/{id}")
    public ModelAndView viewOfferDetails (@PathVariable("id") long id, ModelAndView mnv) {

        OfferDetailsDTO offerDetails = offerService.getOfferDetails(id);

        mnv.addObject("offerDetails", offerDetails);
        mnv.setViewName("details");
        return mnv;
    }
}
