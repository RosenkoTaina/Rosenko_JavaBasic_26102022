package com.hillel.rosenko.lessons.lesson6;

public class Homework8 {
    public static void main(String[] args) {

////        version 1
//        for (int i = 1; i <= 10; i++) {
//            if (i == 4 || i == 9) {
//                continue;
//            }
//            System.out.println("number shuttle " + i);
//        }
//        for (int i = 11; i <= 100; i++) {
//            int num1 = i % 10;
//            if (num1 == 4 || num1 == 9) {
//                continue;
//            }
//            System.out.println("number shuttle " + i);
//


//       version 2
        System.out.println();
        System.out.println("List of shuttle:");
        int k = 0;
        for (int i = 1; i < 200; i++) {
            String str = String.valueOf(i);
            if (str.contains("4") || str.contains("9")) {
            continue;
            }
            System.out.println(str);
            k++;
            if (k > 99) {
                break;
            }
        }
            System.out.println("Quantity of shuttle " + k);
    }
}





