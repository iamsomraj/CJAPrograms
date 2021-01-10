package com.psl.training.assignment.sma;

import java.util.Scanner;

/**
 * Assignment Date 10.1.21 Write a program that will reverse the sequence of
 * letters in each word of a chosen paragraph . For instance, " To be or not to
 * be " Would become " oT eb ro ton ot eb"
 * 
 * @author Somraj Mukherjee
 *
 */
public class MakeReverseUtil {

	public static String makeReverse(String str) {
		String words[] = str.split(" ");
		String reversed = "";
		for (String word : words) {
			reversed += new StringBuilder(word).reverse().toString() + " ";
		}
		return reversed;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = sc.nextLine();
		System.out.println("The reverse:\n" + makeReverse(str));
	}

}
