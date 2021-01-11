package com.psl.training.assignment.one;

/**
 * Assignment Date 11.1.21
 * 
 * 
 * h
 * 
 * h e
 * 
 * h e l
 * 
 * h e l l
 * 
 * h e l l o
 * 
 * @author Somraj Mukherjee
 *
 */
public class CharPatternUtil {

	/**
	 * Draws the pattern
	 * 
	 * @param num
	 */
	public static void display(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(str.charAt(j) + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		display("hello");
	}

}
