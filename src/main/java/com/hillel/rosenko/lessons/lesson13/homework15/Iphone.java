package com.hillel.rosenko.lessons.lesson13.homework15;

public class Iphone extends Smartphone implements Smartphones {

    public Iphone(String name, String model) {
        super(name, model);
        this.os = 1;
    }

}
