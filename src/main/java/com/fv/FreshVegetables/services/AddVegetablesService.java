package com.fv.FreshVegetables.services;

import org.springframework.stereotype.Service;

@Service
public interface AddVegetablesService {

    public void AddVegetables(String name, int price, String category, String description, boolean availability, String image, boolean addedToCart, boolean dispatched, boolean paymentStatus, int amount);

}

