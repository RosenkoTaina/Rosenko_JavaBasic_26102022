package com.hillel.rosenko.lessons.lesson15.homework18;

public class ClassToTest {
	public static void main(int[][] MatrixToTest) {

		squareMatrix(MatrixToTest);
		getAverage(MatrixToTest);
	}

	public static int squareMatrix(int[][] matrixToTest) {
		try {
			int matrixRowLength = matrixToTest.length;
			int matrixColLength = matrixToTest[0].length;

			if (matrixRowLength != matrixColLength) {
				return 1; //Matrix is not square
			} else if (matrixRowLength == matrixColLength) {
				return 2; //Matrix is square
			}
		} catch (NullPointerException e) {
			return -1; //Matrix is null
		} catch (ArrayIndexOutOfBoundsException e) {
			return -2; //Matrix is empty
		}
		return 0;
	}

	public static void getAverage(int[][] matrixToTest) {
		int counter = 0;
		double sum = 0;
		for (int i = 0; i < matrixToTest.length; i++) {
			for (int j = 0; j < matrixToTest[i].length; j++) {
				sum = sum + matrixToTest[i][j];
				counter++;
			}
		}
		System.out.println(sum / counter);


	}

}


