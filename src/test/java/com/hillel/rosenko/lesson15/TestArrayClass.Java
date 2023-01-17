package com.hillel.rosenko.lesson15;

import com.hillel.rosenko.lessons.lesson15.homework18.ClassToTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


//-2 ArrayIndexOutOfBoundsException
//-1 NullPointerException
//2 Square Matrix
//1 Not Square Matrix

public class TestArrayClass {
	int[][] matrixToTest;

	public void createMatrix() {
		matrixToTest = new int[][] { { 3, 2, 1, 7 }, { 9, 11, 5, 4 }, { 6, 0, 13, 17 }, { 7, 21, 14, 15 } }; // comment this whole line to check for null
//		matrixToTest = new int[][] {}; // to check for empty
	}

	
//Positive Tests
	@Test
	public void isNotNull() {
		assertNotEquals(-1, ClassToTest.squareMatrix(matrixToTest));
	}

	@Test
	public void isnotEmpty() {
		assertNotEquals(-2, ClassToTest.squareMatrix(matrixToTest));
	}

	@Test
	public void isSquare() {
		assertEquals(2, ClassToTest.squareMatrix(matrixToTest));
		System.out.println("Matrix is Square");
		ClassToTest.getAverage(matrixToTest); //
	}

}
