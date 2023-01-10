package com.hillel.rosenko.lessons.lesson14.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {

        runApp();

    }


    public static void runApp()  {

        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();

        DrinksMachine userDrinkType = null;
        System.out.println("Please enter drinks: " + Arrays.toString(drinksMachines));
        System.out.println("Please enter \\exit\\ to END");

        double price = 0;
        boolean stop = false;
        while (!stop) {
            try {
                if (scanner.hasNextLine()) {
                    String userValue = String.valueOf(scanner.nextLine());
                    userValue = userValue.toUpperCase();

                    for (DrinksMachine drinksMachine : drinksMachines) {
                        if (drinksMachine.toString().equals(userValue)) {
                            userDrinkType = DrinksMachine.valueOf(userValue);
                            break;
                        } else if (userValue.equals("EXIT")) {
                            System.out.println("count drinks: " + Counter.getCounter());
                            System.out.println("Total: " + price);
                            stop = true;
                            scanner.close();
                            break;
                        }
                    }
                }

                if (userDrinkType != null) {
                    switch (userDrinkType) {
                        case COFFEE: {
                            new Counter();
                            System.out.println("Your order " + DrinksMachine.COFFEE.getDrink());
                            price += DrinksMachine.COFFEE.getCost();
                            break;
                        }
                        case TEA: {
                            new Counter();
                            System.out.println("Your order " + DrinksMachine.TEA.getDrink());
                            price += DrinksMachine.TEA.getCost();
                            break;
                        }
                        case LEMONADE: {
                            new Counter();
                            System.out.println("Your order " + DrinksMachine.LEMONADE.getDrink());
                            price += DrinksMachine.LEMONADE.getCost();
                            break;
                        }

                        case MOJITO: {
                            new Counter();
                            System.out.println("Your order " + DrinksMachine.MOJITO.getDrink());
                            price += DrinksMachine.MOJITO.getCost();
                            break;
                        }
                        case MINERAL_WATER: {
                            new Counter();
                            System.out.println("Your order " + DrinksMachine.MINERAL_WATER.getDrink());
                            price += DrinksMachine.MINERAL_WATER.getCost();
                            break;
                        }
                        case COCA_COLA: {
                            new Counter();
                            System.out.println("Your order " + DrinksMachine.COCA_COLA.getDrink());
                            price += DrinksMachine.COCA_COLA.getCost();
                            break;
                        }
                        default:
                            throw new IllegalArgumentException("Invalid operation");
                    }
                } else { System.out.println("Invalid operation");
                   return;

                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}





