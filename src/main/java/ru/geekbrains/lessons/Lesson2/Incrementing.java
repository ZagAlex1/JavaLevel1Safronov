package ru.geekbrains.lessons.Lesson2;

public class Incrementing {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
    }

    private static void test1() {
        int c = 0;
        System.out.println(c++);
        System.out.println(++c);
        System.out.println(c--);
        System.out.println(--c);
        System.out.println(c + 1);
        System.out.println(c);
    }

    private static void test2() {
        int a = 5;
        int b = 5;

        int resultOne = 2 * ++a;
        int resultTwo = 2 * b++;

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(a + " " + b);
    }

    private static void test3() {
        int c = 1;
        System.out.println(c++ + c);
        System.out.println(++c + c);
        System.out.println(c + +c++);
        c += ++c + c;
        System.out.println(c);
    }
}
