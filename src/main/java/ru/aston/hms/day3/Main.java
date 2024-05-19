package ru.aston.hms.day3;

import ru.aston.hms.day3.animal.Animal;
import ru.aston.hms.day3.animal.Fish;
import ru.aston.hms.day3.animal.mammals.Bear;
import ru.aston.hms.day3.animal.mammals.Cat;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Fish(6, "Fishkin"),
            new Cat(3, "Meow"),
            new Bear(5, "Beer")
        };

        Cat cat2 = new Cat(3, "Meow");
        Cat cat3 = new Cat(3, "Meoow");
        System.out.println("Cat1 hash: " + animals[1].hashCode());
        System.out.println("Cat2 hash: " + cat2.hashCode());
        System.out.println("Cat3 hash: " + cat3.hashCode());
        System.out.println(animals[1].equals(cat2));
        System.out.println("Cat3");

        String str = new String("kek");
        String str2 = new String("kek");
        System.out.println("Str hash: " + str.hashCode());
        System.out.println("Str2 hash: " + str2.hashCode());
        System.out.println(str.equals(str2));
        String str3 = "kek";
        String str4 = "kek";
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}