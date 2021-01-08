package com.psl.training.assignment.lfa;

import java.util.*;

/**
 * Assignment Date 8.1.21
 * 
 * @author Somraj Mukherjee 033670
 *
 */
public class CalMaxUtil {

	/**
	 * Calculates maximum number from 3 integers
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return int
	 */
	public static int calMax(int x, int y, int z) {
		int max = Math.max(x, Math.max(y, z));
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integers one by one: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = calMax(a, b, c);
		System.out.println("Maximum: " + max);
	}

}
