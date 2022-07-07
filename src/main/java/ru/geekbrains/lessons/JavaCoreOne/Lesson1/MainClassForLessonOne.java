package ru.geekbrains.lessons.JavaCoreOne.Lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class MainClassForLessonOne {

    public static void main(String[] args) {
//        System.out.println("Hello, GeekBrains");
//        printHello();
//        testVars();
        checkAppraisal();
    }

    static void printHello() {
        System.out.println("Hello, world");
    }

    private static void testVars() {
        int varA = 9;
        int varB = 5;
        double result = 1.0 * varA / varB;

        System.out.println(result);

        double doubleVarA = 9.0;
        float floatVarB = (float) doubleVarA - 4;
        System.out.println(doubleVarA / floatVarB);

        varA += 3;
        varA *= 3;
        varA++;
        varA--;
        System.out.println(varA);

        boolean isRed = true;
        isRed = false;

        char chr1 = '♥';
        char chr2 = 1234;
        System.out.println((char) (chr1 + chr2));

        String helloStr = "Hello";
        String worldStr = "world";

        System.out.println(helloStr + ", " + worldStr + "!");
        System.out.println(helloStr + 1 + 3);
        System.out.println(helloStr + (1 + 3));

    }

    private static void checkAppraisal() {
        int appraisal = ThreadLocalRandom.current().nextInt(8) - 2;
        System.out.println("Школьник принес оценку: " + appraisal);

        if (appraisal == 5) {
            System.out.println("Молодец! Так держать");
        } else if (appraisal == 4) {
            System.out.println("Хорошо, но ты можешь лучше");
        } else if (appraisal >= 1 && appraisal <= 3) {
//        } else if (appraisal == 3 || appraisal == 2) {
            System.out.println("Готовь уроки лучше");
        } else {
            System.out.println("Не мухлюй! Говори правду");
        }

        System.out.println("Проверка дневника окончена");
    }
}
