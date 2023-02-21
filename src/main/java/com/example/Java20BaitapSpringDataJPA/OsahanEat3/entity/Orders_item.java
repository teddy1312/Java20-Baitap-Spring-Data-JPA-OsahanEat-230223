package com.example.Java20BaitapSpringDataJPA.OsahanEat3.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "orders_item")
public class Orders_item {
    @EmbeddedId
    private Orders_item_ID orders_item_id;

    @ManyToOne()
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    private int amount;
    private float price;

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
}
