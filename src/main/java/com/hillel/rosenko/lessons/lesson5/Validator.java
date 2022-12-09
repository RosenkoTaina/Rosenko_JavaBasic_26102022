package com.hillel.rosenko.lessons.lesson5;


import java.util.Scanner;

public class Validator {
    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String prompt) {
        System.out.print(prompt);
        int userData;
        while (true) {
            if (sc.hasNextInt()) {
                userData = sc.nextInt();
                if (userData >= 0 && userData <= 5) {
                    break;
                } else {
                    System.out.print("Enter number from 1 to 5");
                }
            } else {
                System.out.print("You enter not valid number");
            }
            sc.nextLine();
        }

        return userData;
    }
}


