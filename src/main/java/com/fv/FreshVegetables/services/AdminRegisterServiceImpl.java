package com.fv.FreshVegetables.services;

import com.fv.FreshVegetables.entities.Admin;
import com.fv.FreshVegetables.repo.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminRegisterServiceImpl implements AdminRegisterService{

    @Autowired
    private AdminRepository adminRepository;

//    @Autowired
//    private Admin admin;
    Admin admin = new Admin();


    @Override
    public void registerAdmin(String name, String email, String password, String username, String phone_no, String address, String role, String image) {

        //admin.setId(id);
        admin.setName(name);
        admin.setEmail(email);
        admin.setPassword(password);
        admin.setUsername(username);
        admin.setPhone_no(phone_no);
        admin.setAddress(address);
        admin.setRole(role);
        admin.setImage(image);

        admin.setId(0);

        this.adminRepository.save(admin);
    }
}
