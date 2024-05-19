package ru.aston.hms.day2.hm1;

import ru.aston.hms.day2.hm1.vehicles.Airplane;
import ru.aston.hms.day2.hm1.vehicles.Helicopter;
import ru.aston.hms.day2.hm1.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Airplane("Panter", 1200.3F),
                new Helicopter("Ventor", 1800.2F)
        };
    }
}