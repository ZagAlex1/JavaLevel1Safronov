package ru.geekbrains.lessons.JavaCore1.Lesson5;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Виталий", 1000, 80, 10560);
        Player player2 = new Player("Олег", 2100, 78, 31560);
        Player player3 = new Player("Павел");

//        player1.point = 9999;
//        player2.point = 1000;
//
//        System.out.println(player1.point);
//        System.out.println(player2.point);

//        System.out.println(player1.toString());

//        player3.point = -1000;
//        player3.money = -1000000;

        player1.printInfo();
        player2.printInfo();
        player3.printInfo();

        Player [] players = {player1, player2, player3};
        for (Player player : players) {
            player.jump();
        }

        System.out.println(player1.getPoint());
        Player.setPlayersCountInfo();
    }
}
