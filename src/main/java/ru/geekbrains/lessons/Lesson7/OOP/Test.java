package ru.geekbrains.lessons.Lesson7.OOP;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat("Ричард");
        Plate plate = new Plate(50);

        plate.printInfo();

        while (plate.getFoodCount() > 0) {
            cat.eat(plate);
            plate.printInfo();
            Thread.sleep(1000);
        }
    }

}
