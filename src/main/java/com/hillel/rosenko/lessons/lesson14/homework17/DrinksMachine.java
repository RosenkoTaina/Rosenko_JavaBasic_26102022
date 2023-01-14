package com.hillel.rosenko.lessons.lesson14.homework17;

import java.util.HashMap;
import java.util.Map;

public enum DrinksMachine {
    COFFEE("coffee", Drinks.COFFEE),
    TEA("tea", Drinks.TEA),
    LEMONADE("lemonade", Drinks.LEMONADE),
    MOJITO("mojito", Drinks.MOJITO),
    MINERAL_WATER("mineral water", Drinks.MINERAL_WATER),
    COCA_COLA("coca-cola", Drinks.COCA_COLA);

    private static final Map<String, DrinksMachine> BY_NAME = new HashMap<>();
    private static final Map<Double, DrinksMachine> BY_COST = new HashMap<>();


    static {
        for (DrinksMachine e : values()) {
            BY_NAME.put(e.name, e);
            BY_COST.put(e.cost, e);

        }
    }

    public final String name;
    public final double cost;

    private DrinksMachine(String name, double cost) {
        this.name = name;
        this.cost = cost;

    }

    public static DrinksMachine valueOfDrink(String name) {
        return BY_NAME.get(name);
    }

    public static DrinksMachine valueDrinkCost(double cost) {
        return BY_COST.get(cost);
    }

}




//    private final String drink;
//    private final double cost;
//    DrinksMachine(String drink, double cost){
//            this.drink = drink;
//            this.cost = cost;
//        }
//            public String getDrink() {
//                return drink;
//            }
//            public double getCost(){
//                return cost;
//            }
//
//}




