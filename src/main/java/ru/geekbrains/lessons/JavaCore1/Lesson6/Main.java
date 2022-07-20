package ru.geekbrains.lessons.JavaCore1.Lesson6;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Артем", 16267);
        Knight knight = new Knight("Борис", 123534, "Эскалибур");
        Player bard = new Bard("Лютик", 1);

        bard.doAction();

        wizard.printInfo();
        knight.printInfo();


        wizard.doAction();
        knight.doAction();
        System.out.println();
        System.out.println();
        System.out.println();

        Player[] players = {wizard, bard, knight};

        for (Player player : players) {
            player.printInfo();

//            if (player instanceof Bard) {
//                Bard b  = (Bard) player;
//                b.sing();
//            }
            if (player instanceof Bard b) {
                b.sing();
            }

        }
        for (Player player : players) {
            test(player);
        }

        Object[] objects = {
                new Date(),
                new int[]{1, 2, 3,4,5},
                knight,
                new Scanner(System.in),
                "Hello",
                5

        };

        for (Object object : objects) {
            System.out.println(object);
        }
    }

    private static void test(Player player) {
        player.doAction();
    }
}
