package com.hillel.rosenko.lessons.lesson6;

public class homework8 {
    public static void main(String[] args) {

//        version 1
        for (int i = 1; i <= 10; i++) {
            if (i == 4 || i == 9) {
                continue;
            }
            System.out.println("number shuttle " + i);

        }
        for (int i = 11; i <= 100; i++) {
            int num1 = i % 10;
            if (num1 == 4 || num1 == 9) {
                continue;
            }
            System.out.println("number shuttle " + i);
        }

//       version 2
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("All number of shuttle:");
        for (int i = 1; i <= 100; i++) {
            String str = String.valueOf(i);
            if (str.contains("4") || str.contains("9")) {
                String str1 = str.replaceAll(String.valueOf(i), " - unlucky shuttle");
                System.out.println(str + str1);
            } else {
                System.out.println(str);
            }
        }

    }

}

