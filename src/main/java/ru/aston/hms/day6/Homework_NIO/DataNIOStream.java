package day6.Homework_NIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataNIOStream {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 34, 1.68, false);
        writeDataToFile(tom);

        readDataFromFile();
    }

    private static void writeDataToFile(Person tom) {
        Path path = Paths.get("resources\\data.bin");
        try (DataOutputStream dos = new DataOutputStream(Files.newOutputStream(path))) {
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readDataFromFile() {
        Path path = Paths.get("resources\\data.bin");
        try (DataInputStream dis = new DataInputStream(Files.newInputStream(path))) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Person {
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String n, int a, double h, boolean m) {
        this.name = n;
        this.height = h;
        this.age = a;
        this.married = m;
    }
}