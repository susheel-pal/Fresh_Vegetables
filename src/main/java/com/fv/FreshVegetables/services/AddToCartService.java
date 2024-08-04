package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Vegetables;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddToCartService {

    public List<Vegetables> getVegetablesAddedToCart(boolean addedToCart);

    public void deleteVegetable(int id);
}
