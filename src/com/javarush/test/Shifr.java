package com.javarush.test;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.nio.file.Files;
import java.nio.file.Path;

public class Shifr {
    public static final String symbolForShifr = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ,!.-?:";
    public static final String upSymbolForShifr = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ ,!.-?:";
    public static final int key = 5;


    public static char shifrText(char symbol, int key) {
        if (symbolForShifr.indexOf(symbol) != -1){
            return symbolForShifr.charAt((symbolForShifr.indexOf(symbol) + key) % symbolForShifr.length());
         } else if (upSymbolForShifr.indexOf(symbol) != -1){
            return upSymbolForShifr.charAt((upSymbolForShifr.indexOf(symbol) + key) % upSymbolForShifr.length());
        }
        else {
            return symbol;
        }
    }
    public static String code() throws IOException {
        Path path = Path.of("D:\\Nataliya\\myprogect\\project1\\text.txt");
        String text = Files.readString(path);
        System.out.println("Оригинал текста: " + text);
        //int key = 5;
        String text2 = null;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Nataliya\\myprogect\\project1\\text2.txt"))) {
            for (int i = 0; i < text.length(); i++) {
                text2 = String.valueOf(shifrText(text.charAt(i), key));
                System.out.print(text2);
                bufferedWriter.write(text2, 0, text2.length());
                bufferedWriter.flush();
            }
        }

        return text2;
    }
}