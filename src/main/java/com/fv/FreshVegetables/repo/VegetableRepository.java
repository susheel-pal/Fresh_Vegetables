package com.fv.FreshVegetables.repo;

import com.fv.FreshVegetables.entities.Vegetables;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VegetableRepository extends CrudRepository<Vegetables, Integer> {

    public Vegetables findByName(String name);

    public List<Vegetables> findByCategory(String category);

    public List<Vegetables> findByAddedToCart(boolean addedToCart);

    public List<Vegetables> findByDispatched(boolean dispatched);
}
