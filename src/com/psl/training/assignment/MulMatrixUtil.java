package com.psl.training.assignment;

public class MulMatrixUtil {
	public static int SIZE = 12;

	public static void displayMultiplicationMatrix() {
		System.out.println("The Multiplication Matrix: ");
		int[][] table = new int[SIZE][SIZE];
		for (int i = 0; i < table.length; ++i) {
			for (int j = 0; j < table[i].length; ++j) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < table.length; ++i) {
			for (int j = 0; j < table[i].length; ++j) {
				System.out.print("\t" + table[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		displayMultiplicationMatrix();
	}

}
