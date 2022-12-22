package com.hillel.rosenko.lessons.lesson11;

public class Burger {
    String name;
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    void BurgerInfo() {
        System.out.println(this.name + " burger");
    }
        void setComponents() {
        String[] component = new String[5];
        component[0] = this.bun;
        component[1] = this.meat;
        component[2] = this.cheese;
        component[3] = this.greens;
        component[4] = this.mayonnaise;

        for (String i : component) {
            System.out.println(i);
        }
    }


}
