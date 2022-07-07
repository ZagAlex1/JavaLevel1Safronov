package ru.geekbrains.lessons.JavaCoreTwo.Lesson1.Part2;

public class Cat {
    private Color color;

    public Color getColor() {
        return color;
    }

    class Test1 {

    }

    static class Test2 {

    }

    public void setColor(Color color) {
        class Name {

        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color.getEnglishColor() + '\'' +
                '}';
    }
}
