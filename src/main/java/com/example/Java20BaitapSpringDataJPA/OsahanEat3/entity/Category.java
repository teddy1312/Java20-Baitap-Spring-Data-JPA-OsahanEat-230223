package com.example.Java20BaitapSpringDataJPA.OsahanEat3.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Category_restaurant> category_restaurant;

    @OneToMany(mappedBy = "category")
    private Set<Food> food;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Category_restaurant> getCategory_restaurant() {
        return category_restaurant;
    }

    public void setCategory_restaurant(Set<Category_restaurant> category_restaurant) {
        this.category_restaurant = category_restaurant;
    }

    public Set<Food> getFood() {
        return food;
    }

    public void setFood(Set<Food> food) {
        this.food = food;
    }
}
