package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.User;
import com.fv.FreshVegetables.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterServiceImpl implements UserRegisterService{

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private User user;

    User user = new User();

    @Override
    public void registerUser(String name, String email, String password, String username, String phone_no, String address, String role, String image) {

        //user.setId(id);
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);
        user.setPhone_no(phone_no);
        user.setAddress(address);
        user.setRole(role);
        user.setImage(image);

        user.setId(0);

        this.userRepository.save(user);
    }
}
