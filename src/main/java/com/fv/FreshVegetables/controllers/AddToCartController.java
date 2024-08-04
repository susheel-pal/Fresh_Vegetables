package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.services.AddToCartService;
import com.fv.FreshVegetables.services.AddVegetablesService;
import com.fv.FreshVegetables.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/addToCartApi")
@Controller
public class AddToCartController {

    @Autowired
    private VegetableService vegetableService;

    @Autowired
    private AddToCartService addToCartService;

    @GetMapping("/getByCart/{addedToCart}")
    public String getByCart(@PathVariable("addedToCart") boolean addedToCart, Model model){

        List<Vegetables> list = addToCartService.getVegetablesAddedToCart(addedToCart);
        model.addAttribute("addedToCartVegetable", list);
        return "cart";
    }

    @PostMapping("/removeVegetable")
    public String removeFromCart(@ModelAttribute Vegetables vegetables , Model model){

        int userId = vegetables.getId();
        this.addToCartService.deleteVegetable(userId);
        return "cart";
    }
}
