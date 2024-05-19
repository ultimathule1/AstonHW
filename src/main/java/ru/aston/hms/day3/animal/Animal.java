package ru.aston.hms.day3.animal;

public abstract class Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void voice();

    @Override
    public int hashCode() {
        return age * 13 + name.length() * 37 + (Math.abs(name.toCharArray()[0] * 73 - name.toCharArray()[name.length()-1] * 57));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Animal animal)) return false;
        if (obj == this) return true;
        return (animal.getAge() == this.getAge()) && (this.getName().equals(animal.getName()));
    }
}