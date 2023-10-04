package ru.example;

import lombok.Getter;

@Getter
public abstract class Product {
    protected String brand;
    protected String model;
    protected int cost;
    protected int rate;

    public Product(String brand, String model, int cost, int rate) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.rate = rate;
    }

    public abstract <T> T getType();

    public abstract void print();
}
