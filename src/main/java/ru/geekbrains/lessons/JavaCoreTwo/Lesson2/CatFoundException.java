package ru.geekbrains.lessons.JavaCoreTwo.Lesson2;

import java.io.IOException;

public class CatFoundException extends IOException {
    public CatFoundException() {
        super("Кот не пройдет");
    }

    public CatFoundException(int i, String name) {
        super(String.format("%s прокрался на вечеринку под номером %d", name, i));
    }
}
