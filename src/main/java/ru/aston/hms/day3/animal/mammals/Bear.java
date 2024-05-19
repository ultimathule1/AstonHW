package ru.aston.hms.day3.animal.mammals;

import ru.aston.hms.day3.animal.mammals.interfaces.HasWool;

public class Bear extends Mammal implements HasWool {

    public Bear(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("Rrrrragh!");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bear)) return false;
        return super.equals(obj);
    }
}
