package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.Orders;
import com.fv.FreshVegetables.login.AdminLogin;
import com.fv.FreshVegetables.services.AdminLoginService;
import com.fv.FreshVegetables.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/adminLoginApi")
@Controller
public class AdminLoginController {

    @Autowired
    private AdminLoginService adminLoginService;

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/adminLogin")
    private String adminLogin(@ModelAttribute("adminLogin") AdminLogin adminLogin, Model model){

        String email = adminLogin.getEmail();
        String password = adminLogin.getPassword();

        boolean admin = adminLoginService.validateAdmin(email,password);

        if(admin){
            List<Orders> ordersList = this.ordersService.getAllOrders();
            model.addAttribute("getAllOrders", ordersList);
            model.addAttribute("error", "");
            return "admin_page";
        }
        else {
            model.addAttribute("error", "Invalid email or password");
            return "login";
        }
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }
}