package com.antdevrealm.pathfinder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView viewIndex(ModelAndView modelAndView){
        double sofiaTemp = new Random().nextDouble();

        modelAndView.setViewName("index");
        modelAndView.addObject("sofiaTemperature", sofiaTemp);
        return modelAndView;
    }
}
