package com.javarush.test;

import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BrutForsr {
    public static boolean brutForce() throws IOException {
        Path path = Path.of("D:\\Nataliya\\myprogect\\project1\\text2.txt");
        String text = Files.readString(path);
        System.out.println("Оригинал текста - " + text);
        // System.out.println("Записывает, в целевой объект все незаписанные данные.");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Nataliya\\myprogect\\project1\\textnew.txt"))) {
            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < Shifr.symbolForShifr.length(); j++) {
                for (int i = 0; i < text.length(); i++) {
                    builder.append(getStr(text, j, i));
                }
                String result = builder.toString();
                builder.delete(0, result.length());
                //for (int i = 0; i < result.length() - 1; i++) {
                 //   if (!(result.charAt(i) != ',' || result.charAt(i + 1) != ' ')) {
                        if (isaBoolean(text, result)) {
                            System.out.println("Ключ = " + j);
                            System.out.print("Результат - " + result);
                            bufferedWriter.write(result, 0, result.length());
                            bufferedWriter.flush();
                        }
            }
        }
        return false;
    }

    private static boolean isaBoolean(String text, String result) {
        return !(!result.contains(" ") || !result.endsWith(".") || Character.isLowerCase(result.charAt(0)) || Character.isUpperCase(result.charAt(text.length() - 1)));
    }

    private static String getStr(String text, int j, int i) {
        return String.valueOf(Shifr.shifrText(text.charAt(i), Shifr.symbolForShifr.length() - (j % Shifr.symbolForShifr.length())));
    }
}