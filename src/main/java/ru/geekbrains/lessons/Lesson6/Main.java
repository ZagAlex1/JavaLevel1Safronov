package ru.geekbrains.lessons.Lesson6;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Артем", 16267);
        Knight knight = new Knight("Борис", 123534, "Эскалибур");
//        Player player = new Player("Test", 123, "Test");

        wizard.printInfo();
        knight.printInfo();
//        player.printInfo();

        wizard.doAction();
        knight.doAction();
//        player.doAction();
    }
}
