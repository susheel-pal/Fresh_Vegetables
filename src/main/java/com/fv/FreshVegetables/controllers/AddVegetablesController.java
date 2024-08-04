package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.services.AddVegetablesService;
import com.fv.FreshVegetables.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/addVegetablesApi")
@Controller
public class AddVegetablesController {

    @Autowired
    private VegetableService vegetableService;

    @Autowired
    private AddVegetablesService addVegetablesService;

    @PostMapping("/addVegetables")
    public String AddVeg(@ModelAttribute Vegetables vegetables, Model model) {

        //int uId = vegetables.getId();
        String uName = vegetables.getName();
        int uPrice = vegetables.getPrice();
        String uCategory = vegetables.getCategory();
        String uDescription = vegetables.getDescription();
        boolean uAvailability = vegetables.isAvailability();
        String uImage = vegetables.getImage();
        boolean uAddedToCart = vegetables.isAddedToCart();
        boolean uDispatched = vegetables.getDispatched();
        boolean uPaymentStatus = vegetables.getPaymentStatus();
        int uAmount = vegetables.getAmount();

        this.addVegetablesService.AddVegetables(uName, uPrice, uCategory,uDescription,uAvailability,uImage,uAddedToCart,uDispatched,uPaymentStatus,uAmount);

        //this.vegetableService.AddVegetables(uId, uName, uPrice, uCategory,uDescription,uAvailability,uImage);

        System.out.println("vegetable successfully inserted " + vegetables.getName());
        return "admin_page";
    }
}
