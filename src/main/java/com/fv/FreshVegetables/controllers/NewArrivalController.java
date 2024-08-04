package com.fv.FreshVegetables.controllers;

import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.services.NewArrivalService;
import com.fv.FreshVegetables.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/newArrivalApi")
public class NewArrivalController {

    @Autowired
    private VegetableService vegetableService;

    @Autowired
    private NewArrivalService newArrivalService;

    @GetMapping("getNewArrival/{dispatched}")
    public List<Vegetables> getNewArrivals(@PathVariable("dispatched") boolean dispatched){

        List<Vegetables> newList = newArrivalService.getNewArrivals(dispatched);
        return newList;
    }
}
