package ru.aston.hms.day2.hm2;

import ru.aston.hms.day2.hm2.animal.Animal;
import ru.aston.hms.day2.hm2.animal.Fish;
import ru.aston.hms.day2.hm2.animal.mammals.Bear;
import ru.aston.hms.day2.hm2.animal.mammals.Cat;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Cat(4, "Kate"),
            new Bear(2, "Miha"),
            new Fish(5, "Fishki")
        };
    }
}