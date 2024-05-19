package ru.aston.hms.day2.hm1.vehicles;


import ru.aston.hms.day2.hm1.interfaces.HasWheels;

public class Cab extends Vehicle implements HasWheels {
    public Cab(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void move() {
        System.out.println("I transport people");
    }
}
