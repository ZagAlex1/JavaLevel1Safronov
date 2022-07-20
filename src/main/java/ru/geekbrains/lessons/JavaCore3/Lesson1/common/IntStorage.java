package ru.geekbrains.lessons.JavaCore3.Lesson1.common;

public class IntStorage {

    private Integer[] data;

    public static final int DEFAULT_SIZE = 10;

    private int currentSize;

    public IntStorage(int size) {
        this.data = new Integer[size];
        currentSize = 0;
    }

    public IntStorage() {
        this(DEFAULT_SIZE);
    }

    public void add(Integer value) {
        add(value, currentSize);
    }

    public void add(Integer value, int index) {
        data[index] = value;
        currentSize++;
    }

    public void display() {
        for (Integer datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }

    public void remove(int index) {
        data[index] = 0;
        currentSize--;
    }

    public boolean find(Integer value) {
        for (int i = 0; i < currentSize; i++) {
            if (value.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    public void sort() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                Integer a = data[i];
                Integer b = data[j];
                if (a > b) {
                    exchange(i, j);
                }
            }
        }
    }

    public void exchange(int i, int j) {
        Integer temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int get(int index) {
        return data[index];
    }

    public void removeLast() {
        remove(--currentSize);
    }
}
