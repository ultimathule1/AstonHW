package ru.aston.hms.day4.hm2.MyCollections;

import java.util.Objects;

public class MyLinkedList <E> extends MyAbstractList<E>{
    private Node<E> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        size = 0;
    }

    public MyLinkedList(E value) {
        this.head = new Node<>(value, null);
        size++;
    }

    @Override
    public void add(E value) {
        if (this.head == null) {
            this.head = new Node<>(value, null);
        } else {
            Node<E> iteratorNode = head;
            while(iteratorNode.next != null) {
                iteratorNode = iteratorNode.next;
            }

            iteratorNode.next = new Node<>(value, null);
        }

        size++;
    }

    @Override
    public void add(int index, E value) {
        Objects.checkIndex(index, size);
        if (index == 0) {
            head = new Node<>(value, head);
        } else {
            Node<E> prevNode = getNode(index - 1);
            prevNode.next = new Node<>(value, prevNode.next);
        }
        size++;
    }
    public void addAll(MyList<? extends E> addedList) {
        int lastIndexNode = size - 1;
        Node<E> currentNode = getNode(lastIndexNode);
        for (int i = 0; i < addedList.size(); i++) {
            currentNode.next = new Node<>(addedList.get(i), null);
            currentNode = currentNode.next;
        }
        size += addedList.size();
    }

    @Override
    public E remove(int index) {
        Objects.checkIndex(index, size);
        size--;

        if (index == 0) {
            Node<E> removingNode = head;
            head = head.next;
            return removingNode.value;
        } else {
            Node<E> prevNode = getNode(index - 1);
            Node<E> removingNode = getNode(index);
            prevNode.next = removingNode.next;
            return  removingNode.value;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<E> currentNode = head;
        for (int i = 0; i < size; i++) {
            currentNode = this.getNode(i);
            array[i] = currentNode.value;
        }

        return array;
    }

    private Node<E> getNode(int index) {
        Node<E> cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        int ptr = 0;

        for (Node<E> iterator = head; (ptr < size); ptr++) {
            if (index == ptr) {
                return iterator.value;
            }
            iterator = iterator.next;
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder returnStr = new StringBuilder("[");

        Node<E> iterateNode = head;
        Character splitter = ';';
        for (int i = 0; i < size; i++) {
            returnStr.append(iterateNode.value);
            if (i < size - 1) {
                returnStr.append(splitter).append(" ");
            }
            iterateNode = iterateNode.next;
        }
        returnStr.append("]");

        return returnStr.toString();
    }
}

class Node<E> {
    Node<E> next;
    E value;

    Node(E value, Node<E> next) {
        this.next = next;
        this.value = value;
    }
}