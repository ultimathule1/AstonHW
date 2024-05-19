package day6.Homework_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class FileOutputStreamNIO {
    public static void main(String[] args) {
            String value = "Hello World!!!\nWelcome to Java!";
            String filename = "resources/output.txt";


        try {
                Path path = Path.of(filename);
                Files.createDirectories(path.getParent());
//                byte[] byteData = value.getBytes();
//                Files.write(path, byteData, CREATE, WRITE);
                Files.writeString(path, value, CREATE, WRITE);
                System.out.println("Запись произошла успешна!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
