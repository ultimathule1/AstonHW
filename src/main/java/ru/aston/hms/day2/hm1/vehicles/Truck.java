package ru.aston.hms.day2.hm1.vehicles;

import ru.aston.hms.day2.hm1.interfaces.CarriesCargo;
import ru.aston.hms.day2.hm1.interfaces.HasWheels;

public class Truck extends Vehicle implements CarriesCargo, HasWheels {
    public Truck(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void move() {
        System.out.println("I drive this truck!");
    }
}
