package ru.example;

public class Phone extends Product {
    private final PhoneType phoneType;

    public Phone(String brand, String model, int cost, int rate, PhoneType phoneType) {
        super(brand, model, cost, rate);
        this.phoneType = phoneType;
    }

    public String getPhoneType() {
        return phoneType.getName();
    }

    @Override
    public void print() {
        System.out.println("Телефон { " +
                "Тип телефона = '" + phoneType.getName() + '\'' +
                ", Бренд = '" + brand + '\'' +
                ", Модель = '" + model + '\'' +
                ", Цена = " + cost +
                "$, Рейтинг = " + rate +
                " }");
    }

    @Override
    public PhoneType getType() {
        return phoneType;
    }
}
