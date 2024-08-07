package com.antdevrealm.pathfinder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView viewIndex(ModelAndView mnv){
        double sofiaTemp = new Random().nextDouble();

        mnv.setViewName("index");
        mnv.addObject("sofiaTemperature", sofiaTemp);
        return mnv;
    }
}
