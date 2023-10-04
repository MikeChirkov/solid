package ru.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WatchType {
    SMARTWATCH("Смарт-часы"),
    SIMPLE_WATCH("Обычные часы");

    private final String name;
}
