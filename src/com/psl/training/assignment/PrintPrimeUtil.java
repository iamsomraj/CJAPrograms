
package com.psl.training.assignment;

import java.util.Scanner;

/**
 * Assignment Date 8.1.20 Method will accept range value and print all prime
 * numbers from 2 to range on console.
 * 
 * @author Somraj Mukherjee
 *
 */
public class PrintPrimeUtil {
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

	public static void printPrime(int maxVal) {
		System.out.println("The series of prime numbers: ");
		for (int i = 2; i < maxVal; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int max = sc.nextInt();
		printPrime(max);
	}

}