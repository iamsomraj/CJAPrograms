package com.psl.training.assignment.sma;

import java.util.Scanner;

/**
 * Assignment Date 10.1.21 Find the number of occurrences of given word in a
 * sentence
 * 
 * @author Somraj Mukherjee
 *
 */
public class CheckUtil {

	/**
	 * Gives the number of occurrences of a given word in a sentence
	 * 
	 * @param sentence
	 * @param word
	 * @return int
	 */
	public static int check(String sentence, String word) {
		int count = 0;
		String words[] = sentence.split(" ");
		for (String w : words) {
			if (w.equals(word)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sen = sc.nextLine();
		System.out.println("Enter a word to find: ");
		String wrd = sc.nextLine();
		System.out.println("Number of occurence :" + check(sen, wrd));
	}

}
