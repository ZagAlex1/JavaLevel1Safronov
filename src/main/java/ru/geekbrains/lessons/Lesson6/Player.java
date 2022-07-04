package ru.geekbrains.lessons.Lesson6;

public abstract class Player {
    private String nickname;
    private int point;
    protected String russianProfessionTitle;

    public Player(String nickname, int point, String russianProfessionTitle) {
        this.nickname = nickname;
        this.point = point;
        this.russianProfessionTitle = russianProfessionTitle;
    }

//    public Player() {
//    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRussianProfessionTitle() {
        return russianProfessionTitle;
    }

    public void setRussianProfessionTitle(String russianProfessionTitle) {
        this.russianProfessionTitle = russianProfessionTitle;
    }

    @Override
    public String toString() {
        return String.format("%s %s имеет %d", russianProfessionTitle, nickname, point);
    }

    public abstract void doAction();

    public void printInfo() {
        System.out.println(this);
    }

}
