package com.hillel.rosenko.lessons.lesson10;

public class Task2 {

    public static void main(String[] args) {
        int value;
        value = ackRecursion(2, 4);
        System.out.println(value);
    }

    static int ackRecursion(int a, int b) {
        if (a == 0) {
            return b + 1;
        } else if (a > 0) {
            if (b == 0) {
                return ackRecursion(a - 1, 1);
            } else {
                return ackRecursion(a - 1, ackRecursion(a, b - 1));
            }
        }
            return ++a;
        }
    }
