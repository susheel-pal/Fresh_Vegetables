package com.fv.FreshVegetables.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "id")
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    int price;

    @Column(name = "category")
    String category;
    @Column(name = "description")
    String description;

    @Column(name = "availability")
    boolean availability;

    @Column(name = "image")
    String image;

    @Column(name = "addedToCart")
    boolean addedToCart;

    @Column(name = "dispatched")
    boolean dispatched;

    @Column(name = "paymentStatus")
    boolean paymentStatus;

    @Column(name = "amount")
    int amount;

    @Column(name = "weight")
    String weight;

    public Orders() {

    }

    public Orders(int id, String name, int price, String category, String description, boolean availability, String image, boolean addedToCart, boolean dispatched, boolean paymentStatus, int amount, String weight) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.availability = availability;
        this.image = image;
        this.addedToCart = addedToCart;
        this.dispatched = dispatched;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
        this.weight = weight;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = "image_url";
    }

    public boolean isAddedToCart() {
        return addedToCart;
    }

    public void setAddedToCart(boolean addedToCart) {
        this.addedToCart = addedToCart;
    }

    public boolean getDispatched() {
        return dispatched;
    }

    public void setDispatched(boolean dispatched) {
        this.dispatched = dispatched;
    }

    public boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", availability=" + availability +
                ", image='" + image + '\'' +
                ", addedToCart=" + addedToCart +
                ", dispatched=" + dispatched +
                ", paymentStatus=" + paymentStatus +
                ", amount=" + amount +
                ", weight='" + weight + '\'' +
                '}';
    }
}