package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.repo.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddVegetablesServiceImpl implements AddVegetablesService {

    @Autowired
    private VegetableRepository vegetableRepository;

//    @Autowired
//    private Vegetables vegetables;

    private Vegetables vegetables = new Vegetables();


    @Override
    public void AddVegetables(String name, int price, String category, String description, boolean availability, String image, boolean addedToCart, boolean dispatched, boolean paymentStatus, int amount) {
        //vegetables.setId(id);
        vegetables.setName(name);
        vegetables.setPrice(price);
        vegetables.setCategory(category);
        vegetables.setDescription(description);
        vegetables.setAvailability(availability);
        vegetables.setImage(image);
        vegetables.setAddedToCart(addedToCart);
        vegetables.setDispatched(dispatched);
        vegetables.setPaymentStatus(paymentStatus);
        vegetables.setAmount(amount);

//        vegetables.setId(1);
//        vegetables.setName("xyz");
//        vegetables.setPrice(200);
//        vegetables.setCategory("asdfghj");
//        vegetables.setDescription("xdrtyhn");
//        vegetables.setAvailability(true);
//        vegetables.setImage("");

        vegetables.setId(0);

        this.vegetableRepository.save(vegetables);
    }
}
