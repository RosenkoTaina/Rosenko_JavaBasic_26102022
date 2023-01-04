package com.hillel.rosenko.lessons.lesson13.homework15;

public abstract class Smartphone implements Smartphones {
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

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Phone info : " + name + " " + model);
        printOS();
        call();
        sms();
        internet();

    }

    public void printOS() {
        printOS(os);
    }


    public void printOS(int n) {
        if (n == LINUXES)
            System.out.println("LinuxOS");
        else if (n == IOS)
            System.out.println("iOS");
        else
            System.out.println("Something is wrong");
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