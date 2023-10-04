package ru.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> productList;
    private int totalCost;

    public Order() {
        productList = new ArrayList<>();
        totalCost = 0;
    }

    public void addToProductList(Product product) {
        productList.add(product);
        totalCost += product.getCost();
    }

    public void showAllProducts() {
        productList.forEach(Product::print);
    }

    public int getTotalCost() {
        return this.totalCost;
    }

}
