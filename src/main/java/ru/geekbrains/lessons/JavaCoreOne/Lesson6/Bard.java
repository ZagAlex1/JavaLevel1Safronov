package ru.geekbrains.lessons.JavaCoreOne.Lesson6;

public class Bard extends Player {

    public Bard(String nickname, int point) {
        super(nickname, point, "Бард");
    }

    @Override
    public void doAction() {
        System.out.println("Бард поет песню");
        sing();
    }

    public void sing() {
        System.out.println("Ведьмаку заплатите чеканной монетой");
    }
}
