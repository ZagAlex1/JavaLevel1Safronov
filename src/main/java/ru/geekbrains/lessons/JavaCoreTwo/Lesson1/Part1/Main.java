package ru.geekbrains.lessons.JavaCoreTwo.Lesson1.Part1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Plane plane = new Plane();
        Wolf wolf = new Wolf();


        Animal[] animals = {cat, dog, duck, wolf};
        Flying[] flyings = {duck, plane, wolf};
        Runner[] runners = {dog, duck, cat, wolf };

        flyings[1].fly();
        runners[1].run();
    }
}
