package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.repo.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddToCartServiceImpl implements AddToCartService {


    @Autowired
    private VegetableRepository vegetableRepository;

//    @Autowired
//    private Vegetables vegetables;

    private Vegetables vegetables = new Vegetables();


    @Override
    public List<Vegetables> getVegetablesAddedToCart(boolean addedToCart) {

        return vegetableRepository.findByAddedToCart(addedToCart);
    }

    @Override
    public void deleteVegetable(int id) {

         this.vegetableRepository.deleteById(id);
    }

}
