package com.hillel.rosenko.lessons.lesson6;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number from 0 to 10 ");

        int i;
        for (i = 1; i < 6; i++) {
            int randomNumber;
            int userData;
                if (sc.hasNextInt()) {
                userData = sc.nextInt();
                sc.nextLine();
                if ((userData >= 0) && (userData <= 10)) {
                    randomNumber = (int) ((Math.random()) * 11);
                    System.out.print(randomNumber + " - random number!");
                    if (randomNumber != userData) {
                        System.out.println(" You have attempts: " + (5 - i));
                        if (i == 5) {
                            System.out.print(" You lose! ");
                        }
                    } else {
                        System.out.printf(" You win!!!! Your lucky number %d \n", userData);
                        break;
                    }
                } else {
                    System.out.println(" Wrong number ");
                    sc.nextLine();
                }
            } else {
                System.out.print ("You enter text");
                sc.nextLine();

            }
        }
    }
}








