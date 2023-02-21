package com.example.Java20BaitapSpringDataJPA.OsahanEat3.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "discount")
    private float discount;

    @ManyToOne()
    @JoinColumn(name = "cate_res_id")
    private Category_restaurant category_restaurant;

    @OneToMany(mappedBy = "coupon")
    private Set<Orders_item> orders_item;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Category_restaurant getCategory_restaurant() {
        return category_restaurant;
    }

    public void setCategory_restaurant(Category_restaurant category_restaurant) {
        this.category_restaurant = category_restaurant;
    }

    public Set<Orders_item> getOrders_item() {
        return orders_item;
    }

    public void setOrders_item(Set<Orders_item> orders_item) {
        this.orders_item = orders_item;
    }
}
