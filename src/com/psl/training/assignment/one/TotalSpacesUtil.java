package com.psl.training.assignment.one;

import java.util.Scanner;

/**
 * Assignment Date 11.1.21 Find the total spaces present in a String
 * 
 * 
 * @author Somraj Mukherjee
 *
 */
public class TotalSpacesUtil {

	/**
	 * Calculates spaces
	 * 
	 * @param str
	 * @return int
	 */
	public static int findTotalSpaces(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case ' ':
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		System.out.println("Total spaces: " + findTotalSpaces(input));
	}

}
