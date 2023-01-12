package com.hillel.rosenko.lessons.lesson14.homework17;

public enum DrinksMachine {
    COFFEE("coffee"),
    TEA("tea"),
    LEMONADE("lemonade"),
    MOJITO("mojito"),
    MINERAL_WATER("mineral water"),
    COCA_COLA("coca-cola");
    private final String drink;

    DrinksMachine(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }


}




