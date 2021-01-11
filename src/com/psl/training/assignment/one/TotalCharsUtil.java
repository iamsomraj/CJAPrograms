package com.psl.training.assignment.one;

import java.util.Scanner;

/**
 * Assignment Date 11.1.21 Find the total characters present in a String
 * 
 * 
 * @author Somraj Mukherjee
 *
 */
public class TotalCharsUtil {

	public static int findTotalChars(String str) {
		return str.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		System.out.println("Total characters: " + findTotalChars(input));
	}

}
