package com.hillel.rosenko.lessons.lesson15.homework18;

import java.util.Random;

public class Homework18 extends ClassToTest{

    public static void main(String[] args) {
        Random random = new Random();
        int row = (int) ((Math.random()) * 11);

        int column = (int) ((Math.random()) * 11);

        System.out.println(row);
        System.out.println(column);

        int[][] matrixToTest = new int[row][column];
        for (int i = 0; i < matrixToTest.length; i++) {
            for (int j = 0; j < matrixToTest[i].length; j++) {
                matrixToTest[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Your matrix  ");
        for (int[] ints : matrixToTest) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        squareMatrix(matrixToTest);
        getAverage(matrixToTest);
    }
}
