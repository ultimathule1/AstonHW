package ru.aston.hms.day6.Homework_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedOutputStreamNIO {
    public static void main(String[] args) {
        String text = "Hello from Buffered Output Stream";
        try {
            Path filePath = Paths.get("resources/BufferedOutputNIO.txt");
            byte[] buffer = text.getBytes();
            Files.write(filePath, buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
