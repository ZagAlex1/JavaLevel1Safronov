package ru.geekbrains.lessons.Lesson2;

public class TestMethods {

    static final int TAX_RUSSIA = 13;

    public static void main(String[] args) {
        rewardEmployee("Timofei", 200);
        rewardEmployee("Oleg", 500);
        rewardEmployee("Alex", 600);
    }

    private static void rewardEmployee(String name, int premium) {
//        int premium = 200;
        int premiumWithoutTax = getPremiumWithoutTax(premium);
        System.out.println("Готовим бумаги для премирования " + name);
        System.out.println("Выделяем бюджет для " + name + " на сумму " + premiumWithoutTax);
        System.out.println("Зачисляем на карточку средства для " + name + " " + premiumWithoutTax);
        System.out.println("Процесс завершен");
        System.out.println();
    }

    private static int getPremiumWithoutTax(int premium) {
        return (int) (premium * (100 - TAX_RUSSIA) / 100);
    }
}
