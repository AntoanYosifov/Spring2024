package com.antdevrealm.mobilelele.service.impl;

import com.antdevrealm.mobilelele.model.UserRegistrationDTO;
import com.antdevrealm.mobilelele.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {
        System.out.println("The user received is: " + userRegistrationDTO.toString());
    }
}
