package ru.example;

public class Watch extends Product {
    private final WatchType watchType;

    public Watch(String brand, String model, int cost, int rate, WatchType watchType) {
        super(brand, model, cost, rate);
        this.watchType = watchType;
    }

    public String getWatchType() {
        return watchType.getName();
    }

    @Override
    public void print() {
        System.out.println("Часы { " +
                "Тип часов = '" + watchType.getName() + '\'' +
                ", Бренд = '" + brand + '\'' +
                ", Модель = '" + model + '\'' +
                ", Цена = " + cost +
                "$, Рейтинг = " + rate +
                " }");
    }

    @Override
    public WatchType getType() {
        return watchType;
    }

}
