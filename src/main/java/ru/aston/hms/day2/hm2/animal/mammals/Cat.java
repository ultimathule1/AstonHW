package ru.aston.hms.day2.hm2.animal.mammals;

import ru.aston.hms.day2.hm2.animal.mammals.interfaces.HasWool;

public class Cat extends Mammal implements HasWool {

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }
}