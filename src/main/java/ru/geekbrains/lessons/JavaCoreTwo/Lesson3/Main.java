package ru.geekbrains.lessons.JavaCoreTwo.Lesson3;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        testArrayList();
//        testLinkedList();
//        testSet();
        testMap();
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

        Collections.sort(arrayList, (s1, s2) -> s1.length() - s2.length());
        Collections.sort(arrayList, Comparator.comparingInt(String::length));
//        Collections.shuffle(arrayList);
//        Collections.reverse(arrayList);
//        Collections.rotate(arrayList, -1);

        System.out.println(Collections.binarySearch(arrayList, "D"));
        System.out.println(Collections.replaceAll(arrayList, "D", "!!!"));

        //STREAM API

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 11, 12);

        System.out.println(integerArrayList.stream().filter(e -> e % 2 == 0).count());
        System.out.println(integerArrayList.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));

        System.out.println(arrayList);
    }

    private static void testLinkedList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(0);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void testSet() {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 2, 1, 3, 4, 1, 2, 3, 4, 5, 4, 4, 2, 1, 2, 3, 4, 5, 1, 2, 1, 1);

        System.out.println(set);
    }

    private static void testMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Russia", "Moscow");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Norway", "Oslo");

//        for (String key : map.keySet()) {
//            System.out.printf("Key: %s -- value: %s%n", key, map.get(key));
//        }

//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.printf("Key: %s -- value: %s%n", entry.getKey(), entry.getValue());
//        }

        map.forEach((key, value) -> System.out.printf("Key: %s -- value: %s%n", key, value));

//        System.out.println(map);
    }
}
