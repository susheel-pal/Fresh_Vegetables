package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.User;
import com.fv.FreshVegetables.services.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/registerUserApi")
@Controller
public class RegisterUserController {

    @Autowired
    private UserRegisterService userRegisterService;

    @PostMapping("/userRegistered")
    public String registerUser(@ModelAttribute User user){

        //int uId = user.getId();
        String uName = user.getName();
        String uEmail = user.getEmail();
        String uPassword = user.getPassword();
        String uUsername = user.getUsername();
        String uPhone_no = user.getPhone_no();
        String uAddress = user.getAddress();
        String uRole = user.getRole();
        String uImage = user.getImage();

        //this.userRegisterService.registerUser(uId,uName,uEmail,uPassword,uUsername,uPhone_no,uAddress,uRole,uImage);
        this.userRegisterService.registerUser(uName,uEmail,uPassword,uUsername,uPhone_no,uAddress,uRole,uImage);

        return "user_page";
    }

    @GetMapping("/registerUser")
    public String register(){

        return "register_user";
    }
}
