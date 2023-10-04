package ru.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    SMARTPHONE("Смартфон"),
    BUTTON_PHONE("Кнопочный телефон");

    private final String name;
}
