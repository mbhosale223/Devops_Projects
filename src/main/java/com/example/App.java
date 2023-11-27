package com.example;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       // Read input from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();


       // Calculate and print the length of the entered word
        int length = calculateWordLength(word);
        System.out.println("Length of the word: " + length);


       // Close the scanner
        scanner.close();
    }


   private static int calculateWordLength(String word) {
        // Check for null or empty input
        if (word == null || word.trim().isEmpty()) {
            return 0;
        }


       // Calculate and return the length of the word
        return word.length();
    }
}
