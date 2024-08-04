package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.repo.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VegetableServiceImpl implements VegetableService{

    @Autowired
    private VegetableRepository vegetableRepository;

//    @Autowired
//    private Vegetables vegetables;

    private Vegetables vegetables = new Vegetables();


    @Override
    public List<Vegetables> getAllVegetables() {
        List<Vegetables> vegetablesList = (List<Vegetables>)this.vegetableRepository.findAll();
        return vegetablesList;
    }



    @Override
    public Vegetables getSingleVegetable(int id) {

       Optional<Vegetables> optional = this.vegetableRepository.findById(id);
       Vegetables veg = optional.get();
       return veg;

    }

    @Override
    public Vegetables getVegetablesByName(String name) {

        return vegetableRepository.findByName(name);
    }

    @Override
    public List<Vegetables> getVegetablesByCategory(String category) {

        return vegetableRepository.findByCategory(category);
    }

    @Override
    public void updateVegetable(int id, String name, int price, String category, String description, boolean availability, String image, boolean addedToCart, boolean dispatched, boolean paymentStatus, int amount) {
        vegetables.setId(id);
        vegetables.setName(name);
        vegetables.setPrice(price);
        vegetables.setCategory(category);
        vegetables.setDescription(description);
        vegetables.setAvailability(availability);
        //vegetables.setImage(image);
        vegetables.setAddedToCart(addedToCart);
        vegetables.setDispatched(dispatched);
        vegetables.setPaymentStatus(paymentStatus);
        vegetables.setAmount(amount);

        this.vegetableRepository.save(vegetables);
    }

}
