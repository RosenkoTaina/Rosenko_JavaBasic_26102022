package com.hillel.rosenko.lessons.lesson12;

public class Fit {
        private String name;
        private int day;
        private String month;
        private int year;
        private String email;
        private int phone;
        private String surname;
        private int weight;
        private int pressureSys;
        private int pressureDia;
        private int steps;
        private int age;

    public Fit(String name, int day, String month, int year, String email, int phone, String surname, int weight,
               int pressureSys, int pressureDia, int steps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressureSys = pressureSys;
        this.pressureDia = pressureDia;
        this.steps = steps;
        this.age = 2020 - year;
    }

    public void printAccountInfo() {
        System.out.printf("""
                        
                        Fit info:
                        Name: %s
                        day: %s
                        month: %s
                        year: %s
                        email: %s
                        phone: %s
                        surname: %s
                        weight: %s
                        pressureSys: %s
                        pressureDia: %s
                        steps: %s
                        age: %s
                        
                        """, getName(), getDay(), getMonth(), getYear(), getEmail(),
                getPhone(), getSurname(), getWeight(), getPressureSys(), getPressureDia(),
                getSteps(), getAge());
    }


       // Can be changed

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getPressureSys() {
        return pressureSys;
    }
    public void setPressureSys(int pressureSys) {
        this.pressureSys = pressureSys;
    }
    public int getPressureDia() {
        return pressureDia;
    }
    public void setPressureDia(int pressureDia) {
        this.pressureDia = pressureDia;
    }
    public int getSteps() {
        return steps;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }

    //  Cant be changed
    public String getName() {
        return name;
    }
    public int getDay() {
        return day;
    }
    public String getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
}


