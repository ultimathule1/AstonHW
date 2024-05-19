package ru.aston.hms.day4.hm2.MyCollections;

import java.util.Comparator;

@SuppressWarnings("unchecked")
public abstract class MyAbstractList<E> implements MyList<E> {
    public static <T> void sort(MyList<T> myList, Comparator<Object> comparator) {
        Object[] array = myList.toArray();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < myList.size() - 1; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    T temp = (T) array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}