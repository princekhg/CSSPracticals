package com.css.practical;

import java.util.Scanner;

public class ExtractInput {
    public static void main(String[] args) {
        String input;
        String numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter a string from the keyboard that contains numbers: ");
        input = scanner.nextLine();
        numbers = input.replaceAll("[^0-9]", " ");
        System.out.println("The Numbers are: " + numbers);
    }
}
