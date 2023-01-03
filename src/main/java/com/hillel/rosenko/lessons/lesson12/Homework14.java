package com.hillel.rosenko.lessons.lesson12;

public class Homework14 {
    public static void main(String[] args) {

            Fit a = new Fit("Ron", 15, "May", 213, "ronron@gmail.com", 239534638, "Hik", 500, 120, 80, 3000);
            Fit b = new Fit("Vova", 22, "September", 1999, "vovavova@gmail.com", 7856444, "Li", 300, 140, 90, 8500);
            Fit c = new Fit("Dmytro", 30, "June", 1998, "dmytrod@gmail.com", 98775432, "Hero", 200, 90, 60, 15000);


            //Printing Initial data
            System.out.println("Initial data");

            a.printAccountInfo();
            b.printAccountInfo();
            c.printAccountInfo();


            //Changing data
            a.setSteps(15);
            a.setPressureSys(300);
            a.setWeight(400);

            b.setSurname("Rip");
            b.setPressureDia(300);
            b.setWeight(45);

            //Printing Changed data
            System.out.println("Changed data");

            a.printAccountInfo();
            b.printAccountInfo();
            c.printAccountInfo();
        }
    }


