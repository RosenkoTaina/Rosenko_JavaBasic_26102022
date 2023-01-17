package com.hillel.rosenko.lessons.lesson15.homework18;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
         squareMatrix(TestArrayClass.MatrixToTest);
        getAverage(TestArrayClass.MatrixToTest);
    }
    public class TestArrayClass {
        int[][] matrixToTest = new int[5][5];
        Random random = new Random();

        for(int i = 0;i<matrixToTest.length;i++)
        {
            for (int j = 0; j < matrixToTest[i].length; j++) {
                matrixToTest[i][j] = random.nextInt(100);
            }
        }
    }
    public static void squareMatrix(int[][] MatrixToTest) {

        int MatrixRowLength = TestArrayClass.MatrixToTest.length;
        int MatrixColLength = TestArrayClass.MatrixToTest[0].length;

        if (MatrixRowLength != MatrixColLength) {

            System.out.println("Matrix is not Square");
        } else {
            System.out.println("Matrix is Square");

        }
    }

    private static void getAverage(int[][] MatrixToTest) {
        int counter = 0;
        double sum = 0;
        for (int i = 0; i < MatrixToTest.length; i++) {
            for (int j = 0; j < MatrixToTest[i].length; j++) {
                sum = sum + MatrixToTest[i][j];
                counter++;
            }
        }
        System.out.println(sum / counter);

    }
}
