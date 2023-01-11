package com.hillel.rosenko.lessons.lesson14.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {

        runApp();

    }


    public static void runApp() {

        try (Scanner scanner = new Scanner(System.in)) {
            DrinksMachine[] drinksMachines = DrinksMachine.values();

            DrinksMachine userDrinkType = null;
            System.out.println("Please enter drinks: " + Arrays.toString(drinksMachines));
            System.out.println("Please enter \\exit\\ to END");

            double price = 0;

            while (true) {
                if (scanner.hasNextLine()) {
                    String userValue = String.valueOf(scanner.nextLine());
                    userValue = userValue.toUpperCase();

                    for (DrinksMachine drinksMachine : drinksMachines) {
                        if (drinksMachine.toString().equals(userValue)) {
                            userDrinkType = DrinksMachine.valueOf(userValue);
                            break;
                        } else if (userValue.equals("EXIT")) {
                            System.out.println("Drinks count: " + Counter.getCounter());
                            System.out.println("Total: " + price);
                            scanner.close();
                            return;
                        } else if (!drinksMachine.toString().equals(userValue)) {
                            userDrinkType = null;

                        }
                    }
                }

                if (userDrinkType != null) {
                    switch (userDrinkType) {
                        case COFFEE: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.COFFEE.getDrink() + " added to your order");
                            price += DrinksMachine.COFFEE.getCost();
                            break;
                        }
                        case TEA: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.TEA.getDrink() + " added to your order");
                            price += DrinksMachine.TEA.getCost();
                            break;
                        }
                        case LEMONADE: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.LEMONADE.getDrink() + " added to your order");
                            price += DrinksMachine.LEMONADE.getCost();
                            break;
                        }

                        case MOJITO: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.MOJITO.getDrink() + " added to your order");
                            price += DrinksMachine.MOJITO.getCost();
                            break;
                        }
                        case MINERAL_WATER: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.MINERAL_WATER.getDrink() + " added to your order");
                            price += DrinksMachine.MINERAL_WATER.getCost();
                            break;
                        }
                        case COCA_COLA: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.COCA_COLA.getDrink() + " added to your order");
                            price += DrinksMachine.COCA_COLA.getCost();
                            break;
                        }
                    }
                } else {
                    System.out.println("Invalid operation else");

                }

            }
        }
    }
}




