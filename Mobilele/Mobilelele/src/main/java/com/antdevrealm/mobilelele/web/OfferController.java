package com.antdevrealm.mobilelele.web;

import com.antdevrealm.mobilelele.model.dto.AddOfferDTO;
import com.antdevrealm.mobilelele.model.enums.EngineTypeEnum;
import com.antdevrealm.mobilelele.service.OfferService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/offers")
public class OfferController {

    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @ModelAttribute
    public AddOfferDTO addOfferDTO () {
        return new AddOfferDTO();
    }

    @GetMapping("/add")
    public String viewOfferAdd(Model model) {

        model.addAttribute("allEngineTypes", EngineTypeEnum.values());
        return "offer-add";
    }


    @PostMapping("/add")
    public String createOffer(
            @Valid AddOfferDTO addOfferDTO,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {

            redirectAttributes.addFlashAttribute("addOfferDTO", addOfferDTO);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.addOfferDTO", bindingResult);

            return "redirect:/offers/add";
        }

        long offerId = offerService.createOffer(addOfferDTO);

        return "redirect:/offers/" + offerId;
    }
}