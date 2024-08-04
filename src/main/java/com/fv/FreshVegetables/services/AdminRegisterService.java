package com.fv.FreshVegetables.services;

import org.springframework.stereotype.Service;

@Service
public interface AdminRegisterService {

    //public void registerAdmin(int id, String name, String email, String password, String username, String phone_no, String address, String role, String image);
    public void registerAdmin(String name, String email, String password, String username, String phone_no, String address, String role, String image);

}
