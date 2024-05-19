package ru.aston.hms.day2.hm2.animal.mammals;

import ru.aston.hms.day2.hm2.animal.Animal;
import ru.aston.hms.day2.hm2.animal.mammals.interfaces.HasSpine;

public abstract class Mammal extends Animal implements HasSpine {

    public Mammal(int age, String name) {
        super(age, name);
    }

    public abstract void voice();
}