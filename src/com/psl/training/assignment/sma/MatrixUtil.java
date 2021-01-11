package com.psl.training.assignment.sma;

import java.util.Arrays;

/**
 * Assignment Date 7.1.21 Class for multiple matrix operations Addition
 * Multiplication Transpose
 * 
 * @author Somraj Mukherjee 033670
 *
 */
public class MatrixUtil {

	/**
	 * Calculates the addition of two matrices 3x4
	 * 
	 * @param a
	 * @param b
	 * @return int[][]
	 */
	public static int[][] add(int[][] a, int[][] b) {
		int row = 3;
		int col = 4;
		int res[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}

	/**
	 * Calculates the multiplication of two matrices 2x3 3x2
	 * 
	 * @param a
	 * @param b
	 * @return int[][]
	 */
	public static int[][] multiply(int[][] a, int[][] b) {
		int row = 2;
		int col = 2;
		int indx = 3;
		int res[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int sum = 0;
				for (int k = 0; k < indx; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				res[i][j] = sum;
			}
		}
		return res;
	}

	/**
	 * Calculates the transpose of a matrix 3x3
	 * 
	 * @param a
	 * @return int[][]
	 */
	public static int[][] transpose(int[][] a) {
		int row = 3;
		int col = 3;
		int res[][] = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = a[j][i];
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int add1[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		int add2[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		int add[][] = add(add1, add2);
		System.out.println("Addition of 2 matrices");
		for (int res[] : add) {
			System.out.println(Arrays.toString(res));
		}

		int mul1[][] = { { 1, 2, 3 }, { 1, 2, 3 } };
		int mul2[][] = { { 1, 2 }, { 1, 2 }, { 1, 2 } };
		int mul[][] = multiply(mul1, mul2);
		System.out.println("Multiplication of 2 matrices");
		for (int res[] : mul) {
			System.out.println(Arrays.toString(res));
		}
		int trans1[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int trans[][] = transpose(trans1);
		System.out.println("Transpose of matrix");
		for (int res[] : trans) {
			System.out.println(Arrays.toString(res));
		}

	}

}
