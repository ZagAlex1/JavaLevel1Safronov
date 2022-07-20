package ru.geekbrains.lessons.JavaCore1.Lesson1.Homework;

public class HomeWorkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(4, 2);
        printColor(101);
        compareNumbers(2,5);
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign(int a, int b) {

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
    }
}
