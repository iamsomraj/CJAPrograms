
package com.psl.training.assignment;

import java.util.Scanner;

/**
 * Assignment Date 8.1.20 Find the number is prime or not
 * 
 * @author Somraj Mukherjee
 *
 */
public class IsPrimeUtil {
	public static boolean isPrimeNumber(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.round(Math.pow(num, 0.5)); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if (isPrimeNumber(number)) {
			System.out.println("The number " + number + " is a prime number");
		} else {
			System.out.println("Sorry, the number " + number + " is not a prime number");

		}
	}

}