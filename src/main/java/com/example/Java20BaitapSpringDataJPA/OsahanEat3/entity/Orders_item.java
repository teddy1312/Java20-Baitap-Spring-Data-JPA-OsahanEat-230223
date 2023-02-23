package com.example.Java20BaitapSpringDataJPA.OsahanEat3.entity;

import javax.persistence.*;

@Entity(name = "orders_item")
public class Orders_item {
    @EmbeddedId
    private Orders_item_ID orders_item_id;

    @ManyToOne()
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @Column(name = "amount")
    private int amount;

    @Column(name = "price")
    private float price;

    @ManyToOne()
    @JoinColumn(name = "order_id",insertable = false,updatable = false)
    private Orders orders;

    @ManyToOne()
    @JoinColumn(name = "food_id",insertable = false,updatable = false)
    private Food food;

    public Orders_item_ID getOrders_item_id() {
        return orders_item_id;
    }

    public void setOrders_item_id(Orders_item_ID orders_item_id) {
        this.orders_item_id = orders_item_id;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
