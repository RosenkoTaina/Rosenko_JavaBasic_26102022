package com.hillel.rosenko.lessons.lesson11;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Burger a = new Burger("Ben Aflek", "bun", "meat","cheese","greens","mayonnaise");
        Burger b = new Burger("Diet", "bun", "meat", "cheese", "greens", "");
        Burger c = new Burger("Double meat", "bun", "2x meat", "cheese", "greens", "mayonnaise");


        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Hello! Menu:\s
                1 - Original burger\s
                2 - Diet burger\s
                3 - Double meat\s
                You can enter number of burger that you want!""");


             while (scanner.hasNextInt()) {
               int burgerNumber = scanner.nextInt();
                if (burgerNumber == 1) {
                    System.out.println("You chose: ");
                    a.BurgerInfo();
                    System.out.println("Your burgers components are: ");
                    a.setComponents();
                } else if (burgerNumber == 2) {
                    System.out.println("You chose: ");
                    b.BurgerInfo();
                    System.out.println("Your burgers components are: ");
                    b.setComponents();
                } else if (burgerNumber == 3) {
                    System.out.println("You chose: ");
                    c.BurgerInfo();
                    System.out.println("Your burgers components are: ");
                    c.setComponents();
                } else {
                    System.out.println("There is no burger with this number ");
                }
               scanner.nextLine();
            }

        }
    }





