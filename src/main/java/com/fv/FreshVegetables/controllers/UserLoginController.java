package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.User;
import com.fv.FreshVegetables.login.UserLogin;
import com.fv.FreshVegetables.services.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/userLoginApi")
@Controller
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @GetMapping("/userLogin")
    private String userLogin(@ModelAttribute("userLogin") UserLogin userLogin, Model model){

        String email = userLogin.getEmail();
        String password = userLogin.getPassword();

        boolean user = userLoginService.validateUser(email,password);

        if(user){
            User user1 = this.userLoginService.getUser(email);
            model.addAttribute("error", "");
            model.addAttribute("getUserDetails", user1);
            return "user_page";
        }
        else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }

    @GetMapping("/uLogin")
    public String userLogin(){

        return "login";
    }
}
