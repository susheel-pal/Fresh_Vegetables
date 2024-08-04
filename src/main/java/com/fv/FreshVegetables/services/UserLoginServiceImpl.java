package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.User;
import com.fv.FreshVegetables.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLoginServiceImpl implements UserLoginService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean validateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if(user != null && user.getPassword().equals(password)){

            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public User getUser(String email) {

        return userRepository.findByEmail(email);
    }
}
