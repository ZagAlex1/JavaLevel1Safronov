package ru.geekbrains.lessons.JavaCore1.Lesson7.OOP;

public class Plate {

    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }
}
