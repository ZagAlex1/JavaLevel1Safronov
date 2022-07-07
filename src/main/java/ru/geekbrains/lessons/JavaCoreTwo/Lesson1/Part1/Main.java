package ru.geekbrains.lessons.JavaCoreTwo.Lesson1.Part1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Plane plane = new Plane();
        Wolf wolf = new Wolf();

        Participant racoon = new Participant() {
            @Override
            public void jump() {

            }

            @Override
            public void run() {

            }
        };

        Animal kangaroo = new Animal() {
            @Override
            public void run() {

            }
            // Анонимный класс
        };

        Animal[] animals = {cat, dog, duck, wolf, kangaroo };
        Flying[] flyings = {duck, plane};
        Runner[] runners = {dog, duck, cat, wolf, racoon };

        flyings[1].fly();
        runners[1].run();

    }
}
