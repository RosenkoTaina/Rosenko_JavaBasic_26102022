package com.hillel.rosenko.lessons.lesson10;

public class Homework12 {
    public static void main(String[] args) {

        Person Will = new Person();
        {
            Will.name = "Will";
            Will.surname = "Smith";
            Will.city = "New York";
            Will.number = "2936729462846";
        }

        Person Jackie = new Person();
        {
            Jackie.name = "Jackie";
            Jackie.surname = "Chan";
            Jackie.city = "Shanghai";
            Jackie.number = "12312412412";
        }
        Person Sherlock = new Person();
        {
            Sherlock.name = "Sherlock";
            Sherlock.surname = "Holmes";
            Sherlock.city = "London";
            Sherlock.number = "37742123513";
        }
            Will.personInfo();
            Jackie.personInfo();
            Sherlock.personInfo();
        }

        static class Person {
            String name;
            String surname;
            String city;
            String number;

            void personInfo() {
                System.out.println("Зателефонувати громадянину " + name +" "+ surname + " із міста "
                        + city + " можна за номером " + number);
            }

        }

    }
