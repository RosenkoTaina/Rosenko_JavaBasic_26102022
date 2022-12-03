package com.hillel.rosenko.lessons.lesson5;


import java.util.Scanner;

public class Validator {
    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String prompt) {
        int result;
        for (; ; ) {
            System.out.print(prompt);
            while (sc.hasNext()) {
                if (!sc.hasNextInt()) {
                    System.out.print("You enter not valid number");
                    sc.next();
                } else if ((sc.nextInt() < 0)) {
                    System.out.println("Please enter a positive number");
                    sc.next();
                } else {
                    result = sc.nextInt();
                    sc.nextLine();
                    return result;
                }
            }

        }
    }
}


//
//            if (sc.hasNextInt()) {
//                result = sc.nextInt();
//                sc.nextLine();
//                while (!sc.hasNextInt()) {
//                    String input = sc.next();
//                    System.out.printf("\"%s\" is not a valid number.%n", input);
//                    result = sc.nextInt();
//                }
//                while (result < 0) ;
//                {
//                    System.out.printf("\"%s\" is not a valid number.%n", result);
//                    return result;
//                }
//            }
//        }
//    }






//        while (sc.hasNext()) {
//            if (!sc.hasNextInt()) {
//                System.out.print("You enter not valid number");
//                sc.next();
//            } else if ((sc.nextInt() < 0)) {
//                System.out.println("Please enter a positive number");
//                sc.next();
//            } else {
//                result = sc.nextInt();
//                sc.nextLine();
//                return result;
//            }
//        }
//        return result;
//    }

