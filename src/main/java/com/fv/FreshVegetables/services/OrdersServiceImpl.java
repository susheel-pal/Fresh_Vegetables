package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Orders;
import com.fv.FreshVegetables.repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class OrdersServiceImpl implements OrdersService {

//    @Autowired
//    private Orders orders;

    private Orders orders = new Orders();

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<Orders> getAllOrders(){

        List<Orders> ordersList = (List<Orders>) this.ordersRepository.findAll();
        return ordersList;
    }

    @Override
    public void addOrders(int id, String name, int price, String category, String description, boolean availability, String image, boolean addedToCart, boolean dispatched, boolean paymentStatus, int amount, String weight) {

        orders.setId(id);
        orders.setName(name);
        orders.setPrice(price);
        orders.setCategory(category);
        orders.setDescription(description);
        orders.setAvailability(availability);
        orders.setImage(image);
        orders.setAddedToCart(addedToCart);
        orders.setDispatched(dispatched);
        orders.setPaymentStatus(paymentStatus);
        //orders.setAmount(amount);
        orders.setWeight(weight);

        if(weight.equals("250G")){

            amount = price/4;
            orders.setAmount(amount);
        } else if(weight.equals("500G")) {

            amount = price/2;
            orders.setAmount(amount);
        } else if(weight.equals("1KG")){

            amount = price;
            orders.setAmount(amount);
        } else if(weight.equals("2KG")){

            amount = price*2;
            orders.setAmount(amount);
        }

        this.ordersRepository.save(orders);
    }
}
