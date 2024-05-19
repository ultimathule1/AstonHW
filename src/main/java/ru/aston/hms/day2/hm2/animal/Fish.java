package ru.aston.hms.day2.hm2.animal;

import ru.aston.hms.day2.hm2.animal.interfaces.Aquatic;

public class Fish extends Animal implements Aquatic {
    public Fish(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("gurgle like fish!");
    }
}
