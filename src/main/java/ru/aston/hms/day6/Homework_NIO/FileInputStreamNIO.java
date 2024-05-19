package ru.aston.hms.day6.Homework_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInputStreamNIO {
    public static void main(String[] args) {
        readAllBytes();
    }

    private static void readAllBytes() {
        Path path = Path.of("resources/output.txt");
        try {
            byte[] bytes = Files.readAllBytes(path);
            String str = new String(bytes);
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}