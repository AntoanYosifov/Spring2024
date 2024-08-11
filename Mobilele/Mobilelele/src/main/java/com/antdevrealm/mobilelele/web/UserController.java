package com.antdevrealm.mobilelele.web;

import com.antdevrealm.mobilelele.model.dto.UserRegistrationDTO;
import com.antdevrealm.mobilelele.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView login(ModelAndView modelAndView){
        modelAndView.setViewName("auth-login");
        modelAndView.addObject("message", "hello");
        return modelAndView;
    }

    @GetMapping("/login/model")
    public String login2(Model model){

        return "index";
    }

    @GetMapping("/register")
    public ModelAndView register(ModelAndView modelAndView){
        modelAndView.setViewName("auth-register");
        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView register(ModelAndView modelAndView, UserRegistrationDTO userRegistrationDTO){
        this.userService.registerUser(userRegistrationDTO);
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
