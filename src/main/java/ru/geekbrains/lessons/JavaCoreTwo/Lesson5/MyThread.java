package ru.geekbrains.lessons.JavaCoreTwo.Lesson5;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}
