package ru.geekbrains.lessons.JavaCore1.Lesson2;

public class ForTest {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        final int LIMIT_OF_CYCLE = 10;
//        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
//            System.out.println("Внешний цикл : " + i);
//            for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
//                System.out.println("Внутренний цикл " + j);
//            }
//        }

//        String str = "";
//        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
//            if (i % 2 == 0) {
//                str += "☻ ";
//            } else {
//                str += "♥ ";
//            }
//            System.out.print(str);
//            for (int j = 0; j < LIMIT_OF_CYCLE - 1 - i; j++) {
//                System.out.print("○ ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                break;
            }

            if (i % 2 == 0) {
                continue;
            }
            System.out.print(" i:" + i);
        }
        System.out.println(" END!");
    }
}
