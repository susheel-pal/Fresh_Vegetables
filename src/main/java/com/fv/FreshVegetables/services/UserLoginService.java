package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserLoginService {

    public boolean validateUser(String email, String password);

    public User getUser(String email);
}
