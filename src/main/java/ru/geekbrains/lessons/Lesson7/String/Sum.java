package ru.geekbrains.lessons.Lesson7.String;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/main/resources/Lib/input.txt");
        File output = new File("src/main/resources/Lib/output.txt");

        Scanner scanner = new Scanner(input);
        PrintWriter pw = new PrintWriter(output);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        pw.print(a.multiply(b));
        pw.close();
        scanner.close();
    }
}
