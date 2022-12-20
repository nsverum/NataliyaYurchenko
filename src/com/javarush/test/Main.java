package com.javarush.test;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        String code = "Зашифровать текст";
        String deCode = "Расшифровать текст";
        String brutForce = "Расшифровать текст методом Brute Force";

        if (phrase.equals(code)) {
            System.out.println("Ключ - " + Shifr.key);
            System.out.println(Shifr.code());

        } else if (phrase.equals(deCode)) {
            System.out.println("Ключ - " + Shifr.key);
            System.out.println(DeShifr.deCode());
            
        } else if (phrase.equals(brutForce)) {
            System.out.println(BrutForsr.brutForce());
        }

    }
}
