package com.antdevrealm.pathfinder.web;

import com.antdevrealm.pathfinder.model.dto.RouteShortInfoDTO;
import com.antdevrealm.pathfinder.service.RouteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RouteController {

    private final RouteService routeService;

    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/routes")
    public ModelAndView viewRoutes(ModelAndView mnv) {

//        RouteShortInfoDTO randomRoute = routeService.getRandomRoute();

        List<RouteShortInfoDTO> allRoutes = routeService.getAllRoutes();

        mnv.setViewName("routes");
        mnv.addObject("allRoutes", allRoutes);
        return mnv;
    }
}
