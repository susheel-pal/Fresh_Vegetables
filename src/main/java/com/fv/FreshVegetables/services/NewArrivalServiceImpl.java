package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Vegetables;
import com.fv.FreshVegetables.repo.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewArrivalServiceImpl implements NewArrivalService {

    @Autowired
    private VegetableRepository vegetableRepository;

//    @Autowired
//    private Vegetables vegetables;

    private Vegetables vegetables = new Vegetables();


    @Override
    public List<Vegetables> getNewArrivals(boolean dispatched) {

        return vegetableRepository.findByDispatched(dispatched);
    }
}
