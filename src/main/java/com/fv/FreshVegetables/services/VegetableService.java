package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Vegetables;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VegetableService {

    public List<Vegetables> getAllVegetables();

    public  Vegetables getSingleVegetable(int id);

    public Vegetables getVegetablesByName(String name);

    public List<Vegetables> getVegetablesByCategory(String category);

    public void updateVegetable(int id, String name, int price, String category, String description, boolean availability, String image, boolean addedToCart, boolean dispatched, boolean paymentStatus, int amount);

}
