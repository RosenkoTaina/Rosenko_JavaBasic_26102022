package com.hillel.rosenko.lessons.lesson11;

public class Burger {
    String name;
    String bun;
    String meat;

    boolean ExtraMeat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger() {
        this.name = "Original";
        this.bun = "bun";
        this.meat = "meet";
        this.cheese = "cheese";
        this.greens = "greens";
        this.mayonnaise = "mayonnaise";
        BurgerInfo();
        setComponents();
    }

    public Burger(String name) {
        this.name = name;
        this.bun = "bun";
        this.meat = "meet";
        this.cheese = "cheese";
        this.greens = "greens";
        this.mayonnaise = "";
        BurgerInfo();
        setComponents();
    }

    public Burger(String name, boolean ExtraMeat) {
        this.name = name;
        this.bun = "bun";
        this.meat = "2x meet";
        this.cheese = "cheese";
        this.greens = "greens";
        this.mayonnaise = "mayonnaise";
        BurgerInfo();
        setComponents();
    }

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

        int k = 0;
        for (String i : component) {
            if (i.equals("")) {
               continue;
            } else if (k < component.length) {
                System.out.println(i);
            } else {
                break;
            }
            k++;
            }
        System.out.println();
    }

}

