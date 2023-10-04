package ru.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Shop {
    private final List<Product> productList;

    public Shop() {
        productList = new ArrayList<>();
        productList.add(new Phone("APPLE", "IPHONE 13 PRO MAX", 500, 3, PhoneType.SMARTPHONE));
        productList.add(new Phone("NOKIA", "3310", 1000, 1, PhoneType.BUTTON_PHONE));
        productList.add(new Watch("APPLE", "SE", 200, 4, WatchType.SMARTWATCH));
        productList.add(new Watch("ПОЛЁТ", "OLD SCHOOL", 5000, 2, WatchType.SIMPLE_WATCH));
    }

    public void showAvailableProducts() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("Товар: " + (i + 1));
            productList.get(i).print();
        }
    }

    public <T> List<Product> getProductByType(T type) {
        return productList.stream()
                .filter(v -> v.getType().equals(type))
                .collect(Collectors.toList());
    }

    public List<Product> sortByRate() {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getRate))
                .collect(Collectors.toList());
    }

    public List<Product> sortByCost() {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getCost))
                .collect(Collectors.toList());
    }
}
