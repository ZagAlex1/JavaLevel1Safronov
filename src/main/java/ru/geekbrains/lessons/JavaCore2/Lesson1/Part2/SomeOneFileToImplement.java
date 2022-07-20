package ru.geekbrains.lessons.JavaCore2.Lesson1.Part2;

public interface SomeOneFileToImplement {
    abstract void action();

    default boolean isTrue() {
        return true;
    }
}
