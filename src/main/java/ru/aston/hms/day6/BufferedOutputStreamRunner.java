package ru.aston.hms.day6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BufferedOutputStreamRunner {
    public static void main(String[] args) {

        String text = "Hello Java world!"; // строка для записи
        try (FileOutputStream out = new FileOutputStream("resources/text3.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
