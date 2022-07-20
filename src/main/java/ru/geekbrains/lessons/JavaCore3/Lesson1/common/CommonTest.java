package ru.geekbrains.lessons.JavaCore3.Lesson1.common;

public class CommonTest {
    public static void main(String[] args) {

        intTest();
    }

    private static void intTest() {
        IntStorage intStorage = new IntStorage(5);
        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(0);
        intStorage.add(0);

        intStorage.display();

        System.out.println("Find 2: " + intStorage.find(2));
        System.out.println("Find 5: " + intStorage.find(5));

        int lastValue = intStorage.get(intStorage.getCurrentSize() - 1);
        System.out.println("Last value: " + lastValue);

        intStorage.sort();


    }
}
