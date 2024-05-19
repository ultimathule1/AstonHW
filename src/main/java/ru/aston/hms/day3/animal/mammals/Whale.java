package ru.aston.hms.day3.animal.mammals;

import ru.aston.hms.day3.animal.interfaces.Aquatic;

public class Whale extends Mammal implements Aquatic {
    public Whale(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("Big gurgle!");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Whale)) return false;
        return super.equals(obj);
    }
}