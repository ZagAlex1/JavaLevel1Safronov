package ru.geekbrains.lessons.JavaCoreTwo.Lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final String LIB = "src/main/resources/lib/";

    public static void main(String[] args) {
//        testException();
//        divideNumb();
//        testScanner();
//        System.out.println(testFinally(6,2));
//        System.out.println(testFinally(6,0));
        danceAnimal();

//        try {
//            readFile("test", "txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.err.println("не удалось прочесть....");
//        }
//        System.out.println("КОНЕЦ");
    }

    private static void testException() {
//        System.out.println(3/0);
//        RuntimeException e = new RuntimeException("Проблема");
//        System.out.println(e.getMessage());
//        throw e;
//        throw new IllegalArgumentException("Ошибка");
        Integer a = Integer.parseInt("743");
        System.out.println(a);
    }

    private static void divideNumb() {
        int a;
        try {
            a = 3 / 1;
            throw new RuntimeException("Что то не предсказуемое");
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
            a = -1;
        } catch (RuntimeException e) {
            e.printStackTrace();
            a = -11111;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException | IllegalArgumentException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Конец " + a);
    }

    private static void testScanner() {
//        Scanner scanner;
//        try {
//            scanner = new Scanner(System.in);
//            int a = scanner.nextInt();
//            scanner.close();
//        } catch (InputMismatchException e) {
//            e.printStackTrace();
//        }
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    private static int testFinally(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return -1;
        } finally {
            return 0;
        }
    }

    private static void readFile() {
        File file = new File(LIB + "test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Очень жаль");
            System.exit(1);
        }
        System.out.println(scanner.nextLine());
    }

    private static void readFile(String filename, String extFile) throws FileNotFoundException {
        File file = new File(LIB + filename + "." + extFile);
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }

    private static void danceAnimal() {
        Animal[] animals = {
                new Animal("Енот") {
                    @Override
                    void action() {
                        System.out.println("Танцует на столе");
                    }
                },
                new Animal("Кот") {
                    @Override
                    void action() {
                        System.out.println("Драть обои");
                    }
                },
                new Animal("Белка") {
                    @Override
                    void action() {
                        System.out.println("Бросается орехами");
                    }
                },
                new Animal("Собака") {
                    @Override
                    void action() {
                        System.out.println("Грызет кость");
                    }
                }
        };

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + " пытается пройти через фейс-контроль");

            try {
                if (animals[i].getName().split(" ", 2)[0].toLowerCase().equals("кот")) {
                    throw new CatFoundException(i,animals[i].getName());
                }
                animals[i].action();
            } catch (CatFoundException e) {
                e.printStackTrace();
            }


        }
    }
}