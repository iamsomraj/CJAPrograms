
package com.psl.training.assignment;

import java.util.Scanner;

/**
 * Assignment Date 8.1.21 Develop the program, which accepts the gross pay and
 * produces the amount of tax owed. For a gross pay of $240 or less, the tax is
 * 0%; for over $240 and less than $480, the tax rate is 15%; and for any pay
 * over $480, the tax rate is 28%.
 * 
 * @author Somraj Mukherjee
 *
 */
public class CalTaxUtil {

	/**
	 * Calculates tax based on a given gross pay
	 * 
	 * @param gp
	 * @return double
	 */
	public static double calTax(int gp) {
		double tax;
		double taxRate;
		if (gp <= 240) {
			taxRate = 0;
		} else if (gp <= 240) {
			taxRate = 0;
		} else if (gp <= 480) {
			taxRate = 15;
		} else {
			taxRate = 28;
		}
		tax = ((gp * taxRate) / 100);
		return tax;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gross pay: ");
		int gp = sc.nextInt();
		System.out.println("The tax: " + calTax(gp));
	}

}
