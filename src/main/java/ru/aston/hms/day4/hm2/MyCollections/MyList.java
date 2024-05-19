package ru.aston.hms.day4.hm2.MyCollections;

public interface MyList <E> {
    void add(E value);
    void add(int index, E value);
    E get(int index);
    int size();
    E remove(int index);
    Object[] toArray();
}
