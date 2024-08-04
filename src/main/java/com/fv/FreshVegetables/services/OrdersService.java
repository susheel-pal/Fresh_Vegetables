package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Orders;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrdersService {

    public void addOrders(int id, String name, int price, String category, String description, boolean availability, String image, boolean addedToCart, boolean dispatched, boolean paymentStatus, int amount, String weight);

    public List<Orders> getAllOrders();
}
