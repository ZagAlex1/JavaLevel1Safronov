package ru.geekbrains.lessons.JavaCoreOne.Lesson3;

import java.util.Arrays;

public class TestArrays {

    static final int ARRAY_SIZE = 7;

    public static void main(String[] args) {
        testOneArray();
        testTwoArray();
    }

    private static void testOneArray() {
        int[] data = new int[ARRAY_SIZE];
//        int[] data2 = {1, 2, 3, 4, 5};
        data[0] = 3;
        data[2] = 345;
        data[data.length - 1] = 56;


        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
        }

//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + " ");
//        }
//        System.out.println();
//        System.out.println(convertArrayToString(data));
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void testTwoArray() {
//        int[][] deepData = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] deepData = new int[3][3];

        int n = 1;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = n++;
            }
        }

//        System.out.println(Arrays.deepToString(deepData));

        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%2d ", deepData[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int[] deepDatum : deepData) {
            for (int num : deepDatum) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }

    private static String convertArrayToString(int[] data) {
        String str = "[";
        for (int i = 0; i < data.length; i++) {
            str += data[i];
            if (i != data.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
