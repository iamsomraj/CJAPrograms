package com.psl.training.assignment.lfa;

import java.util.Scanner;

/**
 * Assignment Date 8.1.21 Some credit card companies pay back a small portion of
 * the charges a customer makes over a year. A particular credit card company's
 * pay back policy is as follows: 1. 0.25% for charges up to Rs. 500. 2. 0.50%
 * for the next Rs.1000 (that is, the portion between Rs. 500 and Rs. 1500), 3.
 * 0.75% for the next Rs.1000 (that is, the portion between Rs. 1500 and Rs.
 * 2500), 4. 1.0% for charges above Rs2500. Thus, a customer who charges Rs. 400
 * a year receives Rs.1.00, which is 0.25 x 1/100 x 400, and one who charges
 * Rs1, 400 a year receives Rs. 5.75, which is 1.25 = 0.25 x 1/100 x 500 for the
 * first Rs. 500 and 0.50 x 1/100 x 900 = 4.50 for the next Rs. 900. Determine
 * by hand the pay backs amount for a customer who charged Rs. 2000 and one who
 * charged Rs. 2600. Define the program, which accepts a charge amount and
 * computes the corresponding pay back amount.
 * 
 * @author Somraj Mukherjee
 *
 */
public class CalLoanUtil {
	public static float carLoan(int charge) {
		float rate;
		if (charge <= 500) {
			rate = 0.25f;
		} else if (charge > 500 && charge <= 1500) {
			rate = 0.5f;
		} else if (charge > 1500 & charge <= 2500) {
			rate = 0.75f;
		} else {
			rate = 1f;
		}
		return (rate * charge) / 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter charges: ");
		int charge = sc.nextInt();
		System.out.println("The pay: " + carLoan(charge));
	}

}
