package ru.geekbrains.lessons.JavaCore2.Lesson5;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("New name");
        t.setPriority(10);
//        t.setDaemon(true);
        System.out.println(t);
    }
}