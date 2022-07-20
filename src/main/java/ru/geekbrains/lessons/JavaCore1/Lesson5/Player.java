package ru.geekbrains.lessons.JavaCore1.Lesson5;

public class Player {
    private String nickname;
    private int point;
    private int level;
    private int money;
    private static int playerCount;

    public static int getPlayerCount() {
        return playerCount;
    }

    public Player(String nickname) {
        this(nickname, 0, 1, 100);
    }

    public static void setPlayersCountInfo() {
        System.out.println("Всего игоков: " + playerCount);
    }

    public Player(String nickname, int point, int level, int money) {
        this.nickname = nickname.toUpperCase();
        this.point = point;
        this.level = level;
        this.money = money;
        System.out.printf("%s: Я родился%n", nickname);
        playerCount++;
    }

    void printInfo() {
//        System.out.printf("Игрок %s(lvl. %d) имеет %d очков и %d монет%n", nickname, level, point, money);
        System.out.println(this);
    }

    public void jump() {
        System.out.println(nickname + " Совершает прыжок");
    }

    public void levelUp() {
        level++;
        money += level * 10;
    }

    @Override
    public String toString() {
        return String.format("Игрок %s(lvl. %d) имеет %d очков и %d монет", nickname, level, point, money);
    }

    public String getNickname() {
        return nickname;
    }

    public int getPoint() {
        return point;
    }

    public int getLevel() {
        return level;
    }

    public int getMoney() {
        return money;
    }
}
