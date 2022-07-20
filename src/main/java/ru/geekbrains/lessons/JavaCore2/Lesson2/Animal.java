package ru.geekbrains.lessons.JavaCore2.Lesson2;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void action();

    public String getName() {
        return name;
    }
}
