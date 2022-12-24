package com.hillel.rosenko.lessons.lesson11;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.print("№1 - ");
        Burger a = new Burger();
        System.out.print("№2 - ");
        Burger b = new Burger("Diet");
        System.out.print("№3 - ");
        Burger c = new Burger("Double meat", true);
        System.out.println ("Please enter the number of burger that you want!");


             while (scanner.hasNextInt()) {
               int burgerNumber = scanner.nextInt();
                if (burgerNumber == 1) {
                    System.out.println("You chose: ");
                    a.BurgerInfo();
                    System.out.println("Your burger components are: ");
                    a.setComponents();
                } else if (burgerNumber == 2) {
                    System.out.println("You chose: ");
                    b.BurgerInfo();
                    System.out.println("Your burger components are: ");
                    b.setComponents();
                } else if (burgerNumber == 3) {
                    System.out.println("You chose: ");
                    c.BurgerInfo();
                    System.out.println("Your burger components are: ");
                    c.setComponents();
                } else {
                    System.out.println("There is no burger with this number ");
                }
               scanner.nextLine();
            }
        }
    }





