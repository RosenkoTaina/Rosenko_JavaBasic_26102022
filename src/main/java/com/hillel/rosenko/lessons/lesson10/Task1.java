package com.hillel.rosenko.lessons.lesson10;

public class Task1 {
    public static void main(String[] args) {
        int value;
        value = euclideanRecursion(60, 48);
        System.out.println(value);
    }

    static int euclideanRecursion(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return euclideanRecursion(a - b, b);
        } else {
            return euclideanRecursion(a, b - a);
        }

    }
}

