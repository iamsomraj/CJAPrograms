package com.psl.training.assignment.sma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Assignment Date 10.1.21 Write a function to find various combinations of
 * entered string
 * 
 * For Eg str= “123”
 * 
 * Output :
 * 
 * 123
 * 
 * 132
 * 
 * 213
 * 
 * 231
 * 
 * 312
 * 
 * 321
 * 
 * @author Somraj Mukherjee
 *
 */
public class GetCombUtil {

	/** 
	 * Generates combinations in a recursive manner
	 * 
	 * @param str
	 * @param combination
	 */
	public static void getCombinations(String str, String combination) {

		if (str.length() == 0) {
			System.out.println(combination);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String restOfString = str.substring(0, i) + str.substring(i + 1);
			getCombinations(restOfString, combination + ch);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("The combinations are: ");
		getCombinations(str, "");

	}

}
