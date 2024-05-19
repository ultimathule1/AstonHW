package ru.aston.hms.day4.hm2;

import ru.aston.hms.day4.hm2.MyCollections.MyAbstractList;
import ru.aston.hms.day4.hm2.MyCollections.MyArrayList;
import ru.aston.hms.day4.hm2.MyCollections.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(20);
        myArrayList.add(35);
        myArrayList.add(40);
        myArrayList.add(14);
        System.out.println("Before added:");
        System.out.println(myArrayList);
        myArrayList.add(6, 15);
        System.out.println("After added:");
        System.out.println(myArrayList);
        System.out.println("size: " + myArrayList.size());
        System.out.println("Remove value: ");
        System.out.println(myArrayList.remove(0));
        System.out.println(myArrayList);

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(3);
        myArrayList2.add(4);
        myArrayList2.add(5);
        myArrayList2.add(7);
        System.out.println("Before added myArrayList2:");
        System.out.println(myArrayList);
        myArrayList.addAll(myArrayList2);
        System.out.println("After:");
        System.out.println(myArrayList);

        System.out.println("Size: " + myArrayList.size());
        System.out.println("Before sort: ");
        System.out.println(myArrayList);
        myArrayList.sort((o1, o2) -> o1 - o2);
        System.out.println("After sort:");
        System.out.println(myArrayList);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(101);
        myLinkedList.add(102);
        myLinkedList.add(150);
        myLinkedList.add(332);
        myLinkedList.add(0, 228);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList.remove(0));
        System.out.println(myLinkedList);

        System.out.println("Before add list to another");
        System.out.println("myArraylist -> " + myArrayList);
        System.out.println("myLinkedList -> " + myLinkedList);
        myLinkedList.addAll(myArrayList);
        System.out.println("After add list to another");
        System.out.println(myLinkedList);

        MyAbstractList.sort(myLinkedList, (o1, o2) -> {
            return (Integer) o1 - (Integer) o2;
        });
        System.out.println("After sort");
        System.out.println(myLinkedList);
    }
}