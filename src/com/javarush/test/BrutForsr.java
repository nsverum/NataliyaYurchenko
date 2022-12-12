package com.javarush.test;

        import java.io.IOException;
        import java.io.*;
        import java.nio.file.Files;
        import java.nio.file.Path;

public class BrutForsr {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("D:\\Nataliya\\myprogect\\project1\\text2.txt");
        String text = Files.readString(path);
        System.out.println(text);
       // System.out.println("Записывает, в целевой объект все незаписанные данные.");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Nataliya\\myprogect\\project1\\textnew.txt"))) {
            StringBuilder builder = new StringBuilder();
                for (int j = 0; j < Shifr.symbolForShifr.length(); j++) {
                    for (int i = 0; i < text.length(); i++) {
                        builder.append(String.valueOf(Shifr.sifrText(text.charAt(i), Shifr.symbolForShifr.length() - (j % Shifr.symbolForShifr.length()))));
                    }
                    String result = builder.toString();
                if (result.endsWith(".")) {
                    System.out.print(result);
                    bufferedWriter.write(result, 0, result.length());
                    bufferedWriter.flush();
                } else {
                       continue;
                    }
               }
        }
    }
}


