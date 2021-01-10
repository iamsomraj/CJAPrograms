package com.psl.training.assignment.sma;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Assignment Date 10.1.21 Write a function findPrime which will accept range of
 * values from user and return int array from function and print all numbers
 * from it
 * 
 * @author Somraj Mukherjee
 *
 */
public class FindPrimeUtil {

	/**
	 * Checks whether the number is prime or not
	 * 
	 * @param num
	 * @return boolean
	 */
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

	/**
	 * Returns an array containing prime numbers
	 * 
	 * @param arr
	 * @return int[]
	 */
	public static int[] findPrime(int arr[]) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int a : arr) {
			if (isPrimeNumber(a)) {
				primes.add(a);
			}
		}
		int result[] = new int[primes.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = primes.get(i);
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of array: ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements one by one: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int primes[] = findPrime(arr);
		System.out.println("The prime numbers are:");
		for (int a : primes) {
			System.out.println(a);
		}
	}

}
