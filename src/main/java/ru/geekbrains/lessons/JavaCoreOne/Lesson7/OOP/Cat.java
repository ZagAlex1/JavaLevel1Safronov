package ru.geekbrains.lessons.JavaCoreOne.Lesson7.OOP;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {

    private String name;


    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        int catEatFoodCount = ThreadLocalRandom.current().nextInt(4) + 3;
        plate.decreaseFood(catEatFoodCount);
        System.out.println("Котик " + name + " съел " + catEatFoodCount + " корма");

    }
}

