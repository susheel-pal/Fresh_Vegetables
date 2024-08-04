package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Vegetables;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewArrivalService {

    public List<Vegetables> getNewArrivals(boolean dispatched);
}
