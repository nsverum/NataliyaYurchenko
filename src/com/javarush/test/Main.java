package com.javarush.test;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        String code = "Хотите зашифровать текст";
        String deCode = "Хотите расшифровать текст";
        String brutForce = "Хотите расшифровать текст методом Грубой силы";

        if (phrase.equals(code)) {
            System.out.println(Shifr.code());
        } else if (phrase.equals(deCode)) {
            System.out.println(DeShifr.deCode());
            
        } else if (phrase.equals(brutForce)) {
            System.out.println(DeShifr.deCode());
        }

    }
}
