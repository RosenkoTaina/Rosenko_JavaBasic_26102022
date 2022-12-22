package com.hillel.rosenko.lessons.lesson9;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        class Validator {
            private static final Scanner sc = new Scanner(System.in);
            public static int getInt(String prompt) {
                int userData;
                System.out.println(prompt);
                while (true) {
                     if (sc.hasNextInt()) {
                       userData = sc.nextInt();
                        if (userData > 0 && userData < 101) {
                            break;
                        } else {
                            System.out.println("Please enter number from 1 to 100");
                        }
                    } else {
                        System.out.println("You enter not valid number. Try again");
                    }
                    sc.nextLine();
                }
                return userData;
            }

        }
        int row;
        int column;

        System.out.println("TRANSPOSE of matrix");
        row = Validator.getInt("Enter the number of rows in matrix: ");
        column = Validator.getInt("Enter the number of columns in matrix: ");

        int[][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("Your matrix BEFORE ");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        System.out.println("Your matrix AFTER ");

        int[][] transpose = transpose(matrix);
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[j][i] + "\t");
            }
            System.out.print("\n");
        }

    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return matrix;
    }
}



