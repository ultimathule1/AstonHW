package ru.aston.hms.day2.hm2.animal.mammals;

import ru.aston.hms.day2.hm2.animal.mammals.interfaces.HasWool;

public class Bear extends Mammal implements HasWool {

    public Bear(int age, String name) {
        super(age, name);
    }

    @Override
    public void voice() {
        System.out.println("Rrrrragh!");
    }
}
