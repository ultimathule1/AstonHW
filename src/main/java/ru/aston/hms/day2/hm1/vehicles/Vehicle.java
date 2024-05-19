package ru.aston.hms.day2.hm1.vehicles;

public abstract class Vehicle {
    private String name;
    private float weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public Vehicle(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void move();
}
