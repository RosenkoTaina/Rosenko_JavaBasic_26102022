package com.hillel.rosenko.lessons.lesson11;

import java.util.Scanner;

public class McDonalds {
    public static void main(String[] args) {
        Burger a = new Burger();
        {
            a.name = "Original";
            a.bun = "bun";
            a.meat = "meet";
            a.cheese = "cheese";
            a.greens = "greens";
            a.mayonnaise = "mayonnaise";

        }
        Burger b = new Burger();
        {
            b.name = "Diet";
            b.bun = "bun";
            b.meat = "meet";
            b.cheese = "cheese";
            b.greens = "greens";
            b.mayonnaise = "";

        }
        Burger c = new Burger();
        {
            c.name = "Double meet";
            c.bun = "bun";
            c.meat = "2x meet";
            c.cheese = "cheese";
            c.greens = "greens";
            c.mayonnaise = "mayonnaise";

        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Hello! Menu:\s
                1 - Original burger\s
                2 - Diet burger\s
                3 - Double meet\s
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





