package com.fv.FreshVegetables.services;

import org.springframework.stereotype.Service;

@Service
public interface UserRegisterService {

    //public void registerUser(int id, String name, String email, String password, String username, String phone_no, String address, String role, String image);

    public void registerUser(String name, String email, String password, String username, String phone_no, String address, String role, String image);

}
