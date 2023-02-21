package com.example.Java20BaitapSpringDataJPA.OsahanEat3.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String address;

    @ManyToOne()
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private Set<Orders> orders;

    @OneToMany(mappedBy = "user")
    private Set<Rating_order> rating_orders;

    @OneToMany(mappedBy = "user")
    private Set<Rating_food> rating_food;

    @OneToMany(mappedBy = "user")
    private Set<Rating_restaurant> rating_restaurant;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public Set<Rating_order> getRating_orders() {
        return rating_orders;
    }

    public void setRating_orders(Set<Rating_order> rating_orders) {
        this.rating_orders = rating_orders;
    }

    public Set<Rating_food> getRating_food() {
        return rating_food;
    }

    public void setRating_food(Set<Rating_food> rating_food) {
        this.rating_food = rating_food;
    }

    public Set<Rating_restaurant> getRating_restaurant() {
        return rating_restaurant;
    }

    public void setRating_restaurant(Set<Rating_restaurant> rating_restaurant) {
        this.rating_restaurant = rating_restaurant;
    }
}
