package ru.example;

import java.util.Scanner;

public class Main {
    private static final String LINE = "----------------------";

    public static void main(String[] args) {
        Shop shop = new Shop();
        Order order = new Order();
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("Введите номер действия: ");
            int n = sc.nextInt();
            switch (n) {
                case 0:
                    return;
                case 1:
                    shop.showAvailableProducts();
                    break;
                case 2:
                    System.out.println("1. Кнопочные \n" +
                            "2. Смартфоны");
                    System.out.print("Введите номер действия:");
                    n = sc.nextInt();
                    if (n == 1) {
                        shop.getProductByType(PhoneType.BUTTON_PHONE).forEach(Product::print);
                    } else if (n == 2) {
                        shop.getProductByType(PhoneType.SMARTPHONE).forEach(Product::print);
                    }
                    break;
                case 3:
                    System.out.println("1. Обычные \n" +
                            "2. Смарт-часы");
                    System.out.print("Введите номер действия:");
                    n = sc.nextInt();
                    if (n == 1) {
                        shop.getProductByType(WatchType.SIMPLE_WATCH).forEach(Product::print);
                    } else if (n == 2) {
                        shop.getProductByType(WatchType.SMARTWATCH).forEach(Product::print);
                    }
                    break;
                case 4:
                    shop.sortByCost().forEach(Product::print);
                    break;
                case 5:
                    shop.sortByRate().forEach(Product::print);
                    break;
                case 6:
                    shop.showAvailableProducts();
                    System.out.print("Введите номер товара:");
                    n = sc.nextInt();
                    order.addToProductList(shop.getProductList().get(n - 1));
                    break;
                case 7:
                    order.showAllProducts();
                    break;
                case 8:
                    System.out.println(order.getTotalCost() + "₽");
                    break;
                default:
                    System.out.println("Неизвестное действие");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println(LINE);
        System.out.println("Магазин телефонов и часов \n" +
                "Возможные действия: \n" +
                "1. Показать все товары \n" +
                "2. Показать телефоны \n" +
                "3. Показать часы \n" +
                "4. Показать отсортированные продукты по цене \n" +
                "5. Показать отсортированные продукты по рейтингу \n" +
                "6. Добавить товар в корзину \n" +
                "7. Показать товары в корзине \n" +
                "8. Показать итоговую цену \n" +
                "0. Выход\n");
        System.out.println(LINE);
    }

}
