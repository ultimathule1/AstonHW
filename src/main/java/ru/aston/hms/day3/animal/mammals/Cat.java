package ru.aston.hms.day3.animal.mammals;

import ru.aston.hms.day3.animal.mammals.interfaces.HasWool;

public class Cat extends Mammal implements HasWool {

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  Cat)) return false;
        return super.equals(obj);
    }
}