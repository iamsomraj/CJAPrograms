package com.psl.training.assignment.one;

import java.util.Scanner;

/**
 * Assignment Date 11.1.21 Find the total of even numbers present in an array
 * 
 * @author Somraj Mukherjee
 *
 */
public class TotalOfNumbersUtil {

	/**
	 * Calculates the sum of even numbers present in the array
	 * 
	 * @param arr
	 * @return int
	 */
	public static int sumEven(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			if (j % 2 == 0) {
				sum += j;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements one by one: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The sum of even numbers: " + sumEven(arr));
	}

}
