package com.fv.FreshVegetables.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "username")
    String username;

    @Column(name = "phone_no")
    String phone_no;

    @Column(name = "address")
    String address;

    @Column(name = "role")
    String role;

    @Column(name = "image")
    String image;

    public User() {

    }

    public User(String email, String password){

        this.email = email;
        this.password = password;
    }

    public User(int id, String name, String email, String password, String username, String phone_no, String address, String role, String image) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.username = username;
        this.phone_no = phone_no;
        this.address = address;
        this.role = role;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = "user";
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = "image_url";
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", phone_no='" + phone_no + '\'' +
                ", address='" + address + '\'' +
                ", role='" + role + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

}
