package ru.aston.hms.day4.hm1;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(){{
            add(4);
            add(2);
            add(3);
            add(7);
        }};
        System.out.println("Array list:");
        System.out.println(arrayList);
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(23,50,10));
        arrayList.add(0, 5);
        arrayList.add(2, 5);
        arrayList.addAll(linkedList);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("Linked List:");
        System.out.println(linkedList);
        linkedList.add(1,77);
        linkedList.addAll(arrayList);
        linkedList.remove(linkedList.size()-1);
        System.out.println(linkedList);
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(linkedList);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "third");
        System.out.println("HashMap:");
        System.out.println(map);

        HashMap<Integer, String> hashMapTest = new HashMap<>();
        hashMapTest.put(23, "twenty three");
        hashMapTest.put(2, "second second");
        hashMapTest.put(10, "ten");
        System.out.println("hashMapTest -> " + hashMapTest);

        map.putAll(hashMapTest);
        System.out.println(map);
        String temp = map.get(2);
        System.out.println("get string -> " + temp);
    }
}