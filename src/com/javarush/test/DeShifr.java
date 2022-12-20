package com.javarush.test;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeShifr {

    public static String deCode() throws IOException {
            Path path = Path.of("D:\\Nataliya\\myprogect\\project1\\text2.txt");
            String text = Files.readString(path);
            System.out.println(text);
            int key = 5;
        String text2 = null;
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Nataliya\\myprogect\\project1\\text1.txt"))){
            for (int i = 0; i < text.length(); i++) {
                 text2 = String.valueOf(Shifr.shifrText(text.charAt(i), (Shifr.symbolForShifr.length()- key) % Shifr.symbolForShifr.length())) ;
                System.out.print(text2);
                bufferedWriter.write(text2, 0, text2.length());
                bufferedWriter.flush();
            }
            }


        return text2;
        }

}
