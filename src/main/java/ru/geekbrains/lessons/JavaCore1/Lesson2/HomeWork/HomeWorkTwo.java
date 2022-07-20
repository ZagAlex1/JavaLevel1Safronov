package ru.geekbrains.lessons.JavaCore1.Lesson2.HomeWork;

public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println(sumBetweenTenAndTwenty(10,5));
        positiveOrNegativeNumber(10);
        System.out.println(booleanPositiveOrNegativeNumber(-5));
        printString("Привет", 6);
        System.out.println(leapYear(1910));

    }

    private static boolean sumBetweenTenAndTwenty(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    private static void positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean booleanPositiveOrNegativeNumber(int a) {
        return a >= 0;
    }

    private static void printString(String string, int printAmount) {
        for (int i = 0; i < printAmount; i++) {
            System.out.println(string);
        }
    }

    private static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        } return  (year % 4 == 0);

    }
}
