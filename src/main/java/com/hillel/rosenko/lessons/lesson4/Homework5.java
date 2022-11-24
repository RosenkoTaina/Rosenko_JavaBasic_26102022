package com.hillel.rosenko.lessons.lesson4;

public class Homework5 {
    public static void main(String[] args) {
        Dynasty li = new Dynasty();
        li.name = "Li";
        Dynasty min = new Dynasty();
        min.name ="Min";

        li.setDim(13,24,46,860);
        min.setDim(9,35,12,1250);


        li.displayInfo();
        min.displayInfo();

        System.out.println("TotalAttack Dynasty Li: " + li.getAttack());
        System.out.println("TotalAttack Dynasty Min: " + min.getAttack());

    }

}

        class Dynasty {
            String name;
            int warrior;
            int archer;
            int cavalryman;
            int number;

            int getAttack() {
                return ((warrior * number)) + ((archer * number)) + ((cavalryman * number));
            }

            void setDim(int w, int a, int c, int n) {
                warrior = w;
                archer = a;
                cavalryman = c;
                number = n;
                }

            public void displayInfo() {
                System.out.printf("""
                        Name: %s
                        Warrior: %d
                        Archer: %d
                        Cavalryman: %d
                        Number: %d
                        """, name, warrior, archer, cavalryman, number);
            }

        }











