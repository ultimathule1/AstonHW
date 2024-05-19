package ru.aston.hms.day2.hm1.vehicles;


import ru.aston.hms.day2.hm1.interfaces.CarriesCargo;
import ru.aston.hms.day2.hm1.interfaces.HasScrew;
import ru.aston.hms.day2.hm1.interfaces.HasWheels;
import ru.aston.hms.day2.hm1.interfaces.HasWings;

public class Airplane extends Vehicle implements HasWheels, HasWings, HasScrew, CarriesCargo {

    public Airplane(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void move() {
        System.out.println("I flew");
    }
}
