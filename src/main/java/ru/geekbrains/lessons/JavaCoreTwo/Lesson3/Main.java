package ru.geekbrains.lessons.JavaCoreTwo.Lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        testArrayList();
    }

    private static void testArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add(1, "X");
        arrayList.add(2, "Y");

//        arrayList.remove("D");
//        arrayList.remove(2);

//        System.out.println(arrayList.get(3));

//        for (String s : arrayList) {
//            System.out.println("-> " + s);
//        }

//        Iterator<?> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            String s = (String) iterator.next();
//            System.out.println("->" + s);
//        }

//        arrayList.clear();

//        arrayList.forEach(s -> System.out.println("->" + s));
//        arrayList.forEach(System.out::println);

//        Object[] objects = arrayList.toArray();

//        String[] strings = arrayList.toArray(new String[0]);
//        Collections.addAll(arrayList, new String[]{"A, B, C"});
//
//        arrayList.trimToSize();

        Collections.sort(arrayList);
//        Collections.shuffle(arrayList);
//        Collections.reverse(arrayList);
//        Collections.rotate(arrayList, -1);

        System.out.println(Collections.binarySearch(arrayList,"D"));
        System.out.println(Collections.replaceAll(arrayList,"D", "!!!"));

        //STREAM API


        System.out.println(arrayList);
    }
}
