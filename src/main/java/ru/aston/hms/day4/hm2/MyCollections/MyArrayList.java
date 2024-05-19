package ru.aston.hms.day4.hm2.MyCollections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class MyArrayList <E> extends MyAbstractList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(int currentCapacity) {
        array = new Object[currentCapacity];
        size = 0;
    }

    public MyArrayList(MyList<? extends E> addedList) {
        array = addedList.toArray();
        size = addedList.size();
    }

    public void add(E value) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size] = value;
        size++;
    }

    public void add(int index, E value) {
        int newSize = size + 1;
        if (index < 0 || index > size) throw new ArrayIndexOutOfBoundsException();

        if (array.length <= newSize) {
            increaseCapacity();
        }

        System.arraycopy(array, index, array, index + 1, newSize - index);
        array[index] = value;
        size = newSize;
    }

    public void addAll(MyList<? extends E> addedList) {
        while (array.length <= (addedList.size() + size)) {
            increaseCapacity();
        }

        for (int i = 0; i < addedList.size(); i++) {
            this.add(addedList.get(i));
        }
    }

    private void increaseCapacity() {
        array = Arrays.copyOf(array,array.length * 2);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Object o = array[index];
        return (E) o;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {
        Objects.checkIndex(index, size);
        E o = (E) array[index];
        int newSize = size - 1;

        if (newSize > index)
            System.arraycopy(array, index + 1, array, index, newSize - index);
        array[size = newSize] = null;

        return o;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        for (Object obj : array) {
            if (o.equals(obj)) return true;
        }

        return false;
    }

    public void sort(Comparator<E> comparator) {
        boolean swapped;
        do {
            swapped = false;

            for (int i = 0; i < size - 1; i++) {
                if (comparator.compare(this.get(i), this.get(i + 1)) > 0) {
                    E temp = get(i);
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    @Override
    public String toString() {
        StringBuilder returnStr = new StringBuilder();
        Character splitter = ';';

        returnStr.append("[");
        for (int i = 0; i < size; i++) {
            returnStr.append(array[i]);
            if (i < size - 1) {
                returnStr.append(splitter).append(" ");
            }
        }
        returnStr.append("]");

        return returnStr.toString();
    }
}
