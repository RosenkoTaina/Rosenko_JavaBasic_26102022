package com.hillel.rosenko.lessons.lesson14.homework17;

public enum DrinksMachine {
    COFFEE("coffee", Drinks.COFFEE),
    TEA("tea", Drinks.TEA),
    LEMONADE("lemonade", Drinks.LEMONADE),
    MOJITO("mojito", Drinks.MOJITO),
    MINERAL_WATER("mineral water", Drinks.MINERAL_WATER),
    COCA_COLA("coca-cola", Drinks.COCA_COLA);
    private final String drink;
    private double cost;
    DrinksMachine(String drink, double cost){
        this.drink = drink;
        this.cost = cost;
    }

    public String getDrink(){
        return drink;
    }
    public double getCost(){
      return cost;
    }


}
