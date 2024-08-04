package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.Admin;
import com.fv.FreshVegetables.services.AdminRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/registerAdminApi")
@Controller
public class RegisterAdminController {

    @Autowired
    private AdminRegisterService adminRegisterService;

    @PostMapping("/adminRegistered")
    public String registerAdmin(@ModelAttribute Admin admin){

        //int uId = admin.getId();
        String uName = admin.getName();
        String uEmail = admin.getEmail();
        String uPassword = admin.getPassword();
        String uUsername = admin.getUsername();
        String uPhone_no = admin.getPhone_no();
        String uAddress = admin.getAddress();
        String uRole = admin.getRole();
        String uImage = admin.getImage();

        //this.adminRegisterService.registerAdmin(uId,uName,uEmail,uPassword,uUsername,uPhone_no,uAddress,uRole,uImage);
        this.adminRegisterService.registerAdmin(uName,uEmail,uPassword,uUsername,uPhone_no,uAddress,uRole,uImage);

        return "admin_page";
    }

    @GetMapping("/registerAdmin")
    public String register(){

        return "register_admin";
    }

}
