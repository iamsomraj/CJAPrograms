package com.psl.training.assignment.one;

/**
 * Assignment Date 11.1.21
 * 
 * 1
 * 
 * 1 2
 * 
 * 1 2 3
 * 
 * 1 2 3 4
 * 
 * 1 2 3
 * 
 * 1 2
 * 
 * 1
 * 
 * @author Somraj Mukherjee
 *
 */
public class DiaPatternUtil {

	/**
	 * Draws the pattern
	 * 
	 * @param num
	 */
	public static void display(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j + 1 + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j < num - i - 1; j++) {
				System.out.print(j + 1 + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		display(4);
	}

}
