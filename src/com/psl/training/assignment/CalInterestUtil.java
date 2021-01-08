package com.psl.training.assignment;

import java.util.Scanner;

/**
 * Assignment Date 8.1.21 Develop a program, that accepts a deposit amount and
 * calculates amount of interest the deposit amount earns in a year. The bank
 * pays a flat 4% interest for deposits of up to Rs.1000, a flat 4.5% per year
 * for deposits of up to Rs.5000, and a flat 5% for deposits of more than
 * Rs.5000.
 * 
 * @author Somraj Mukherjee
 *
 */
public class CalInterestUtil {

	/**
	 * Calculates tax based on a given gross pay
	 * 
	 * @param amount
	 * @return double
	 */
	public static double calInterest(int amount) {
		double interest;
		double interestRate;
		if (amount <= 1000) {
			interestRate = 4d;
		} else if (amount <= 5000) {
			interestRate = 4.5d;
		} else {
			interestRate = 5d;
		}
		interest = ((amount * interestRate) / 100);
		return interest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount = sc.nextInt();
		System.out.println("The interest: " + calInterest(amount));
	}

}
