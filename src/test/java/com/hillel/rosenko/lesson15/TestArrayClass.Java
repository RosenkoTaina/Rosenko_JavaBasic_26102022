package com.hillel.rosenko.lesson15;

import com.hillel.rosenko.lessons.lesson15.homework18.ClassToTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
//-2 ArrayIndexOutOfBoundsException
//-1 NullPointerException
//2 Square Matrix
//1 Not Square Matrix

class TestArrayClass {

	static int[][] matrixToTest;

	@BeforeAll
	public static void createMatrix() {

		Random random = new Random();
		int row = (int) ((Math.random()) * 11);
		int column = (int) ((Math.random()) * 11);

		System.out.println(row);
		System.out.println(column);
		matrixToTest = new int[row][column];
		for (int i = 0; i < matrixToTest.length; i++) {
			for (int j = 0; j < matrixToTest[i].length; j++) {
				matrixToTest[i][j] = random.nextInt(100);
			}
		}
	}



	//Positive Tests
	@Test
	@Order(1)
	public void isNotNull() {
		assertNotEquals(-1, ClassToTest.squareMatrix(matrixToTest));
	}

	@Test
	@Order(2)
	public void isNotEmpty() {
		assertNotEquals(-2, ClassToTest.squareMatrix(matrixToTest));
	}

	@Test
	@Order(3)
	public void isNotVectorRow() {
		assertNotEquals(3, ClassToTest.squareMatrix(matrixToTest));

	}

	@Test
	@Order(4)
	public void isSquare() {
		assertEquals(2, ClassToTest.squareMatrix(matrixToTest));
		System.out.println("Matrix is Square");
		ClassToTest.getAverage(matrixToTest);
	}
}
