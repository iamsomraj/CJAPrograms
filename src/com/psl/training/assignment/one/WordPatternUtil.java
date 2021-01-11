package com.psl.training.assignment.one;

/**
 * Assignment Date 11.1.21
 * 
 * This
 * 
 * is
 * 
 * a
 * 
 * hello
 * 
 * world
 * 
 * program
 * 
 * @author Somraj Mukherjee
 *
 */
public class WordPatternUtil {

	/**
	 * Draws the pattern
	 * 
	 * @param num
	 */
	public static void display(String str) {
		String words[] = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

	public static void main(String[] args) {
		display("This is a hello world program");
	}

}
