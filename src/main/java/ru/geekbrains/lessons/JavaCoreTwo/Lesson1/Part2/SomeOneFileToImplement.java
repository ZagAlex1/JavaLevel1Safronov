package ru.geekbrains.lessons.JavaCoreTwo.Lesson1.Part2;

public interface SomeOneFileToImplement {
    abstract void action();

    default boolean isTrue() {
        return true;
    }
}
