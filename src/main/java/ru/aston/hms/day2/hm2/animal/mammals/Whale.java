package ru.aston.hms.day2.hm2.animal.mammals;

import ru.aston.hms.day2.hm2.animal.interfaces.Aquatic;

public class Whale extends Mammal implements Aquatic {
    public Whale(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("Big gurgle!");
    }
}
