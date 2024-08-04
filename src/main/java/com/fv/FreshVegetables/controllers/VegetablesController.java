package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.services.AddVegetablesService;
import com.fv.FreshVegetables.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/vegetablesApi")
@Controller
public class VegetablesController {

    @Autowired
    private VegetableService vegetableService;

    @Autowired
    private AddVegetablesService addVegetablesService;

    @GetMapping("/getAllVegetables")
    public String allVegetables(Model model){

        List<Vegetables> allVegetables = this.vegetableService.getAllVegetables();
        model.addAttribute("allVegetables", allVegetables);
        return "index";

    }

//    @PostMapping("/addVeg")
//    public void AddAllVeg(@ModelAttribute Vegetables vegetables){
//
//        this.vegetableService.AddVeg(vegetables);
//
//        //return "vegetable save is success";
//    }

//    @PostMapping("/add")
//    public ResponseEntity<String> AddVeg(@RequestBody Vegetables vegetables) {
//
//        int uId = vegetables.getId();
//        String uName = vegetables.getName();
//        int uPrice = vegetables.getPrice();
//        String uCategory = vegetables.getCategory();
//        String uDescription = vegetables.getDescription();
//        boolean uAvailability = vegetables.isAvailability();
//        String uImage = vegetables.getImage();
//        boolean uAddedToCart = vegetables.isAddedToCart();
//        boolean uIsDispatched = vegetables.isDispatched();
//        boolean uPaymentStatus = vegetables.getPaymentStatus();
//        int uAmount = vegetables.getAmount();
//
//        this.addVegetablesService.AddVegetables(uId, uName, uPrice, uCategory,uDescription,uAvailability,uImage,uAddedToCart,uIsDispatched,uPaymentStatus,uAmount);
//
//        //this.vegetableService.AddVegetables(uId, uName, uPrice, uCategory,uDescription,uAvailability,uImage);
//
//        System.out.println(ResponseEntity.ok("vegetable successfully inserted " + vegetables.getName()));
//        return ResponseEntity.ok("vegetable successfully inserted " + vegetables.getName());
//    }

    @GetMapping("/singleVeg/{id}")
    public Vegetables getSingleVeg(@PathVariable("id") int id) {

        System.out.println("id: " + id);
        return vegetableService.getSingleVegetable(id);
    }

    @GetMapping("/getVegByName/name")
    public Vegetables getVegetablesByName(@RequestParam("name") String name, Model model){

        Vegetables vegetable = vegetableService.getVegetablesByName(name);
        if(vegetable == null){
            model.addAttribute("message", "vegetable unavailable");
            return vegetable;
        }
        model.addAttribute("vegetable", vegetable);
        return vegetable;
    }

    @GetMapping("/category/{category}")
    public String getVegetablesByCategory(@PathVariable("category") String category, Model model){

        List<Vegetables> vegList = vegetableService.getVegetablesByCategory(category);
        model.addAttribute("categoryWiseVegetables", vegList);
        return "category_wise_vegetables";
    }

    @GetMapping("/home")
    public String home(){

        return "Home";
    }


    @PostMapping("/addToCart")
    public String addToCart(@ModelAttribute Vegetables vegetables, Model model) {

        int uId = vegetables.getId();
        String uName = vegetables.getName();
        int uPrice = vegetables.getPrice();
        String uCategory = vegetables.getCategory();
        String uDescription = vegetables.getDescription();
        boolean uAvailability = vegetables.isAvailability();
        //String uImage = vegetables.getImage();
        boolean uAddedToCart = vegetables.isAddedToCart();
        boolean uDispatched = vegetables.getDispatched();
        boolean uPaymentStatus = vegetables.getPaymentStatus();
        int uAmount = vegetables.getAmount();

        //this.vegetableService.updateVegetable(uId, uName, uPrice, uCategory,uDescription,uAvailability,uImage,true,uDispatched,uPaymentStatus,uAmount);

        return "index";
    }

    @PostMapping("/removeFromCart")
    public String removeFromCart(@ModelAttribute Vegetables vegetables, Model model) {

        int uId = vegetables.getId();
        String uName = vegetables.getName();
        int uPrice = vegetables.getPrice();
        String uCategory = vegetables.getCategory();
        String uDescription = vegetables.getDescription();
        boolean uAvailability = vegetables.isAvailability();
        //String uImage = vegetables.getImage();
        boolean uAddedToCart = vegetables.isAddedToCart();
        boolean uDispatched = vegetables.getDispatched();
        boolean uPaymentStatus = vegetables.getPaymentStatus();
        int uAmount = vegetables.getAmount();

        //this.vegetableService.updateVegetable(uId, uName, uPrice, uCategory,uDescription,uAvailability,uImage,false,uDispatched,uPaymentStatus,uAmount);

        return "index";
    }
}
