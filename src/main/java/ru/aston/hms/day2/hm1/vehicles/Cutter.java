package ru.aston.hms.day2.hm1.vehicles;

import ru.aston.hms.day2.hm1.interfaces.CarriesCargo;
import ru.aston.hms.day2.hm1.interfaces.HasScrew;

public class Cutter extends Vehicle implements HasScrew, CarriesCargo {
    public Cutter(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void move() {
        System.out.println("I carry cargo by water!");
    }
}
