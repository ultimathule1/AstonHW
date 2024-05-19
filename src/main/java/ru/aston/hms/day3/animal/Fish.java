package ru.aston.hms.day3.animal;

import ru.aston.hms.day3.animal.interfaces.Aquatic;

public class Fish extends Animal implements Aquatic {
    public Fish(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("gurgle like fish!");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Fish)) return false;
        return super.equals(obj);
    }
}
