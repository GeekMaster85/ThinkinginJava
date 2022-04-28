package ControllingExecution;

import java.util.*;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char)c + ", " + c + ": ");
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println("vowel");
                case 'y', 'w' -> System.out.println("Sometimes a vowel");
                default -> System.out.println("consonant");
            }
        }
    }
}