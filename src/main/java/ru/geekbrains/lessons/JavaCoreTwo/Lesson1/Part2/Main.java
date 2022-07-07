package ru.geekbrains.lessons.JavaCoreTwo.Lesson1.Part2;

public class Main {
    public static void main(String[] args) {
        testEnum();
        testInnerClasses();

    }

    private static void testEnum() {
        Cat cat1 = new Cat();

        cat1.setColor(Color.RED);

//        switch (cat1.getColor()) {
//            case RED ->
//        }

        System.out.println(cat1);

    }

    private static void testInnerClasses() {
//        AbstractClass foo = new Foo();
//        AbstractClass bar = new Bar();

        SomeOneFileToImplement foo = () -> System.out.println("ПРивет вселенная");

        SomeOneFileToImplement bar = new SomeOneFileToImplement() {

            @Override
            public void action() {
                System.out.println("Просто привет");
            }
        };

        foo.action();
        bar.action();
    }
}
