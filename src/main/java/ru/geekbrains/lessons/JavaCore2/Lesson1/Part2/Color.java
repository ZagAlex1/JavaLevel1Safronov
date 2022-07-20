package ru.geekbrains.lessons.JavaCore2.Lesson1.Part2;

public enum Color {
    BLACK("Черный"),
    WHITE("Белый"),
    RED("Рыжий"),
    GRAY("Серый");

    private String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }
    public String getEnglishColor() {
        return name().toLowerCase();
    }

}
