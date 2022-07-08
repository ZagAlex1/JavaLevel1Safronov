package ru.geekbrains.lessons.JavaCoreOne.Lesson3.HomeWork;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
//        int[] array = {1, 1, 0, 0, 1, 1, 0, 0};
//        changeNumbersInArray(array);
//        System.out.println();
//        int[] arr = new int[100];
//        setArrayHundred(arr);
//        System.out.println();
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        numberLessSix(arr1);
//        printArr(fillDiagonalByOne(4));
//        fillDiagonalByOne(8);
//        System.out.println(Arrays.toString(arrayFill(5,6)));
        maxMinArray(arr1);
    }

    private static void maxMinArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Максимальное число в массиве : %d%n",max);
        System.out.printf("Минимальное число в массиве : %d",min);
    }

    private static void changeNumbersInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
        }

    }

    private static void setArrayHundred(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

    }

    private static void numberLessSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    private static int[][] fillDiagonalByOne(int number) {
        int[][] arr = new int[number][number];
        int value = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = arr[i][value - i] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
        return arr;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static int[] arrayFill(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(arr, initialValue);
        }
        return arr;
    }
}

