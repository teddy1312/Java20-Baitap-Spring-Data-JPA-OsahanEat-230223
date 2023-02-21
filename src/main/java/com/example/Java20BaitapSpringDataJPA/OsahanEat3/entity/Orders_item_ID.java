package com.example.Java20BaitapSpringDataJPA.OsahanEat3.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Orders_item_ID implements Serializable {
    private int order_id;
    private int food_id;

    public Orders_item_ID(){

    }

    public Orders_item_ID(int order_id, int food_id){
        this.order_id = order_id;
        this.food_id = food_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }
}
