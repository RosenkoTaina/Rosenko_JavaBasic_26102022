package com.hillel.rosenko.lessons.lesson14.homework17;

public class Total {
    private static double total;

    public Total() {
        total ++;
    }

    public static void setTotal(double total) {
        Total.total += total;
    }

    public static double getTotal() {
        return total;
    }
}
