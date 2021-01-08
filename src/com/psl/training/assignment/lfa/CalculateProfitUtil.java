package com.psl.training.assignment.lfa;

import java.util.Scanner;

/**
 * Assignment Date 8.1.21 An old-style movie theater has a simple profit
 * program. Each customer pays $5 per ticket. Every performance costs the
 * theater $20, plus $.50 per attendee. Develop the program that accepts the
 * number of attendees (of a show) and calculates how much income the show
 * earns.
 * 
 * @author Somraj Mukherjee
 *
 */
public class CalculateProfitUtil {

	/**
	 * Calculates the profit based on costs and customers
	 * 
	 * @param numAttendees
	 * @return float
	 */
	public static float calculateProfit(int numAttendees) {
		float performanceCost = 20.0f;
		float attendeeCost = (0.50f * numAttendees);
		float attendeeIncome = (5.0f * numAttendees);
		float profit = (attendeeIncome - (attendeeCost + performanceCost));
		return profit;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of customers: ");
		int cust = sc.nextInt();
		System.out.println("Total income: $" + calculateProfit(cust));
	}

}
