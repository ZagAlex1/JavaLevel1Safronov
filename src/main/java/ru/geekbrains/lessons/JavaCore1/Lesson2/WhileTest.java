package ru.geekbrains.lessons.JavaCore1.Lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class WhileTest {
    public static void main(String[] args) {
        int countApple = 100;
//        while (countApple > 0) {
//            countApple = eatApples(countApple);
//            System.out.println("Яблок стало меньше. Осталось " + countApple);
//        }
        do {
            countApple = eatApples(countApple);
            System.out.println("Яблок стало меньше. Осталось " + countApple);
        } while (countApple > 0);
    }

    private static int eatApples(int countApple) {
        return countApple - ThreadLocalRandom.current().nextInt(5);
    }
}
