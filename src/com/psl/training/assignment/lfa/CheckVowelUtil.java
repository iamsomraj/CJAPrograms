package com.psl.training.assignment.lfa;

import java.util.Scanner;

/**
 * Assignment Date 8.1.21 Write a program to check whether the input alphabet is
 * a vowel or not.
 * 
 * @author Somraj Mukherjee
 *
 */
public class CheckVowelUtil {

	public static boolean checkAlpha(char alph) {
		if (Character.isAlphabetic(alph)) {
			switch (alph) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String ch = sc.nextLine();
		if (checkAlpha(ch.charAt(0))) {
			System.out.println("The character " + ch.charAt(0) + " is a vowel");
		} else {
			System.out.println("Sorry, the character " + ch.charAt(0) + " is not a vowel");

		}
	}

}
