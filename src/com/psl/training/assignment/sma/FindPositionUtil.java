package com.psl.training.assignment.sma;

import java.util.Scanner;

/**
 * Assignment Date 10.1.21 Write a program to find the availability of given
 * number in the list
 * 
 * @author Somraj Mukherjee
 *
 */
public class FindPositionUtil {

	/**
	 * Returns the position of an element in an array
	 * 
	 * @param num
	 * @param nos
	 * @return int
	 */
	public static int findPosition(int num, int[] nos) {
		for (int i = 0; i < nos.length; i++) {
			if (nos[i] == num) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of array: ");
		int nos[] = new int[sc.nextInt()];
		System.out.println("Enter the elements of the array one by one: ");
		for (int i = 0; i < nos.length; i++) {
			nos[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search: ");
		int element = sc.nextInt();
		System.out.println("Position: " + findPosition(element, nos));
	}

}
