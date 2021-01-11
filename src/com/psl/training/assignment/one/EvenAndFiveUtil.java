package com.psl.training.assignment.one;

import java.util.Scanner;

/**
 * Assignment Date 11.1.21 Print all even and multiple of 5 numbers from an
 * array
 * 
 * @author Somraj Mukherjee
 *
 */
public class EvenAndFiveUtil {

	/**
	 * Prints all the elements of an array which is even and divisible by 5
	 * 
	 * @param arr
	 */
	public static void printEvenAndFiveMultiples(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			if (j % 2 == 0 && j % 5 == 0) {
				System.out.println(j);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements one by one: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		printEvenAndFiveMultiples(arr);
	}

}
