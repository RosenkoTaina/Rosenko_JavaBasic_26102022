package com.hillel.rosenko.lessons.lesson8;
import java.util.Arrays;


public class Homework10 {
    public static void main(String[] args) {

        int[] array1 = new int[7];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
            Arrays.sort(array1);
        }
        System.out.println("First array of lottery " + Arrays.toString(array1));

        int[] array2 = new int[7];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
            Arrays.sort(array2);
        }
        System.out.println("Second array of lottery " + Arrays.toString(array2));

        int temp;
        int temp2;

        int counter = 0;
        int matched = 0;

        for (int i = 0; i < array1.length; i++) {
            counter ++;
            temp = array1[i];
            temp2 = array2[i];

            if (temp == temp2) {
                System.out.println(counter + " Couple of numbers is matched! " + temp + " = " + temp2);
                matched++;

            } else {
                System.out.println(counter + " Couple of number is not matched " + temp + " != " + temp2);
            }
        }
        System.out.println("Total Matched " + matched);

    }
}


