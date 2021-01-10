package com.psl.training.assignment.sma;

import java.util.Scanner;

/**
 * Assignment Date 10.1.21 write a function find and replace which will replace
 * the given string from the source string.
 * 
 * 
 * @author Somraj Mukherjee
 *
 */
public class FindReplaceUtil {

	/**
	 * Finds and replaces all the occurences of a susbtring from a string
	 * 
	 * @param find
	 * @param replace
	 * @param sentence
	 * @return String
	 */
	public static String findAndReplace(String find, String replace, String sentence) {
		String result = sentence.replaceAll(find, replace);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		System.out.println("Enter a substring to find: ");
		String find = sc.nextLine();
		System.out.println("Enter a substring to replace: " + find + ": ");
		String replace = sc.nextLine();
		System.out.println("New sentence:\n" + findAndReplace(find, replace, sentence));
	}

}
