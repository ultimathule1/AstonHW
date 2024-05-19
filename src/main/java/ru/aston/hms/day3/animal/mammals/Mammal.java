package ru.aston.hms.day3.animal.mammals;

import ru.aston.hms.day3.animal.Animal;
import ru.aston.hms.day3.animal.mammals.interfaces.HasSpine;

public abstract class Mammal extends Animal implements HasSpine {

    public Mammal(int age, String name) {
        super(age, name);
    }

    public abstract void voice();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  Mammal)) return false;
        return super.equals(obj);
    }
}