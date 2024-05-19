package ru.aston.hms.day2.hm1.vehicles;

import ru.aston.hms.day2.hm1.interfaces.CarriesCargo;
import ru.aston.hms.day2.hm1.interfaces.HasScrew;
import ru.aston.hms.day2.hm1.interfaces.HasWheels;

public class Helicopter extends Vehicle implements HasWheels, HasScrew, CarriesCargo {

    public Helicopter(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void move() {
        System.out.println("I flied like Helicopter! Hehe");
    }
}
