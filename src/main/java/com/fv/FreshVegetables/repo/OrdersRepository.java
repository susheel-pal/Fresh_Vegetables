package com.fv.FreshVegetables.repo;

import com.fv.FreshVegetables.entities.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {

}

