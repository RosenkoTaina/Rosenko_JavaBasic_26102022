package com.hillel.rosenko.lessons.lesson14.homework17;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {

        runApp();


    }



    public static void runApp() {

        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();

        DrinksMachine userDrinkType = null;
        System.out.println("Please enter drinks: " + Arrays.toString(drinksMachines));

        double price = 0;

        while (true) {
            try {
                if (scanner.hasNextLine()) {
                    String userValue = scanner.nextLine();
                    userValue = userValue.toUpperCase();

                    for (DrinksMachine drinksMachine : drinksMachines) {
                        if (drinksMachine.toString().equals(userValue)) {
                            userDrinkType = DrinksMachine.valueOf(userValue);
                        }
                    }
                } else {
                    System.out.println("Невірне значення");
                    scanner.next();
                }

            } catch (InputMismatchException e) {
                System.out.println("Невірне значення");
                scanner.next();
            }
            switch (userDrinkType) {
                case COFFEE: {
                    new Counter();
                    System.out.println("Your order " + DrinksMachine.COFFEE.getDrink());
                    price += DrinksMachine.COFFEE.getCost();
                    System.out.println("Your total " +  price);
                    break;
                }
                case TEA: {
                    new Counter();
                    System.out.println("Your order " + DrinksMachine.TEA.getDrink());
                    price += DrinksMachine.TEA.getCost();
                    System.out.println("Your total " +  price);
                    break;
                }
                case LEMONADE: {
                    new Counter();
                    System.out.println("Your order " + DrinksMachine.LEMONADE.getDrink());
                    price += DrinksMachine.LEMONADE.getCost();
                    System.out.println("Your total " +  price);
                    break;
                }

                case MOJITO: {
                    new Counter();
                    System.out.println("Your order " + DrinksMachine.MOJITO.getDrink());
                    break;
                }
                case MINERAL_WATER: {
                    new Counter();
                    System.out.println("Your order " + DrinksMachine.MINERAL_WATER.getDrink());
                    break;
                }
                case COCA_COLA: {
                    new Counter();
                    System.out.println("Your order " + DrinksMachine.COCA_COLA.getDrink());
                    break;
                }
                case STOP: {
                    System.out.println("Your order ");
                    System.out.println("count drinks: " + Counter.getCounter());
                    System.out.println("Total: " + price);
                    break;
                }


            }

        }
    }
}


