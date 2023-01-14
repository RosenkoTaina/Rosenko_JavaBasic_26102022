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
                            System.out.println("Total: " + Total.getTotal());
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
                            System.out.println("1 " + DrinksMachine.COFFEE.name + " added to your order ");
                            DrinkMaker.makeDrink(userDrinkType);
                            Total.setTotal(DrinksMachine.COFFEE.cost);
                            System.out.println("Total: "  + Total.getTotal());
                            break;
                        }
                        case TEA: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.TEA.name + " added to your order ");
                            DrinkMaker.makeDrink(userDrinkType);
                            Total.setTotal(DrinksMachine.TEA.cost);
                            System.out.println("Total: "  + Total.getTotal());
                            break;
                        }
                        case LEMONADE: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.LEMONADE.name + " added to your order ");
                            DrinkMaker.makeDrink(userDrinkType);
                            Total.setTotal(DrinksMachine.LEMONADE.cost);
                            System.out.println("Total: "  + Total.getTotal());
                            break;
                        }

                        case MOJITO: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.MOJITO.name + " added to your order ");
                            DrinkMaker.makeDrink(userDrinkType);
                            Total.setTotal(DrinksMachine.MOJITO.cost);
                            System.out.println("Total: "  + Total.getTotal());
                            break;
                        }
                        case MINERAL_WATER: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.MINERAL_WATER.name + " added to your order ");
                            DrinkMaker.makeDrink(userDrinkType);
                            Total.setTotal(DrinksMachine.MINERAL_WATER.cost);
                            System.out.println("Total: "  + Total.getTotal());
                            break;
                        }
                        case COCA_COLA: {
                            new Counter();
                            System.out.println("1 " + DrinksMachine.COCA_COLA.name + " added to your order ");
                            DrinkMaker.makeDrink(userDrinkType);
                            Total.setTotal(DrinksMachine.COCA_COLA.cost);
                            System.out.println("Total: "  + Total.getTotal());
                            break;
                        }
                        default:
                            System.out.println ("Unexpected value: " + userDrinkType);
                    }
                } else {
                    System.out.println("Invalid operation");

                }

            }
        }
    }
}




