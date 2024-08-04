package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Admin;
import com.fv.FreshVegetables.repo.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public boolean validateAdmin(String email, String password) {

        Admin admin = adminRepository.findByEmail(email);
        if(admin != null && admin.getPassword().equals(password)){

            return true;
        }
        else {
            return false;
        }
    }
}
