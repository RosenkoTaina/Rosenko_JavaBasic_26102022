package com.hillel.rosenko.lessons.lesson13.homework15;

public abstract class Smartphone implements Smartphones, OS {
    String name;
    String model;
    int os;

    public Smartphone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Smartphone(int os) {
        this.os = os;
    }

    public void info() {
        System.out.println("Phone info : " + getName() + " " + getModel());
        printOS(os);
        call();
        sms();
        internet();
    }
    public void call() {
        System.out.println("call");
    }
    public void sms() {
        System.out.println("sms");
    }
    public void internet() {
        System.out.println("internet");
    }

}
