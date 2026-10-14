package com.sunbeam;

import java.util.Scanner;

public class Ass1_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        if (!scanner.hasNextDouble()) {
            System.err.println("Error: The provided argument is not a valid double value. Terminating program.");
            scanner.close();
            return; 
        }
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        if (!scanner.hasNextDouble()) {
            System.err.println("Error: The provided argument is not a valid double value. Terminating program.");
            scanner.close();
            return; 
        }
        double num2 = scanner.nextDouble();
        
        double average = (num1 + num2) / 2.0;
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}

