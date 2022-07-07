package ru.geekbrains.lessons.JavaCoreOne.Lesson6;

public class Wizard extends Player {
    public Wizard(String nickname, int point) {
        super(nickname, point, "Волшебник");
    }

    @Override
    public void doAction() {
        System.out.printf("%s  %s кастует заклинания %n", getRussianProfessionTitle(), getNickname());
    }
}
