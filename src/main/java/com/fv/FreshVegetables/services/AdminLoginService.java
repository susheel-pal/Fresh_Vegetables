package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminLoginService {

    public boolean validateAdmin(String email, String password);
}
