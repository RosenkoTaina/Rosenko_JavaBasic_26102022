package com.hillel.rosenko.lessons.lesson13.homework15;

public class Iphone extends Smartphone implements Smartphones, OS {
    public Iphone(String name, String model) {
        super(name, model);
        this.os = IOS;
    }

}
