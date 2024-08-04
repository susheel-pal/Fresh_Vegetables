package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.Orders;
import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/getAllOrders")
    public String getAllOrders(Model model){
        List<Orders> ordersList = this.ordersService.getAllOrders();
        model.addAttribute("getAllOrders", ordersList);
        return "orders";
    }


    @PostMapping("/addOrders")
    public String AddOrders(@ModelAttribute Orders orders, Model model) {

        int uId = orders.getId();
        String uName = orders.getName();
        int uPrice = orders.getPrice();
        String uCategory = orders.getCategory();
        String uDescription = orders.getDescription();
        boolean uAvailability = orders.isAvailability();
        String uImage = orders.getImage();
        boolean uAddedToCart = orders.isAddedToCart();
        boolean uDispatched = orders.getDispatched();
        boolean uPaymentStatus = orders.getPaymentStatus();
        int uAmount = orders.getAmount();
        String uWeight = orders.getWeight();

        this.ordersService.addOrders(uId, uName, uPrice, uCategory,uDescription,uAvailability,uImage,uAddedToCart,uDispatched,uPaymentStatus,uAmount,uWeight);

        System.out.println("orders successfully inserted " + orders.getName());
        return "index";
    }
}
