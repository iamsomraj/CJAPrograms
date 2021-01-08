
package com.psl.training.assignment.lfa;

import java.util.Scanner;

/**
 * Assignment Date 8.1.21 Electricity board wants to develop program to
 * calculate Electricity Bill. They have two types of connections domestic and
 * commercial, charges for domestic bill are as follows
 * 
 * if consumed units are less or equals 100 then Rs.4/units or Rs. 250 whichever
 * is greater
 * 
 * if consumed units are between 100 to 300 then Rs.4.50/units
 * 
 * if more than 300 and less than 500 Rs.4.75/units and
 * 
 * above 500 Rs.5/units
 * 
 * For commercial connections charges are calculated as follows
 * 
 * Consumed units are less or equals 100 then Rs.4.25/units or Rs. 350 whichever
 * is greater. if consumed units are between 100 to 300 then Rs.4.75/units. if
 * more than 300 and less than 500 Rs.5/units and above 500 Rs.5.25/units
 * calculate electricity bill.
 * 
 * 
 * @author Somraj Mukherjee
 *
 */
public class ElectricityBillUtil {

	static String COMM_CONN = "COMMERCIAL CONNECTION";
	static String DOM_CONN = "DOMESTIC CONNECTION";

	/**
	 * Calculates electricity bill for connection type and units
	 * 
	 * @param conn
	 * @param units
	 * @return float
	 */
	public static float calElectricityBill(String conn, int units) {
		if (conn.equals(DOM_CONN)) {
			if (units <= 100) {
				return units * 4.0f > 250.0f ? units * 4.0f : 250.0f;
			} else if (units > 100 && units <= 300) {
				return units * 4.5f;
			} else if (units > 300 && units <= 500) {
				return units * 4.75f;
			} else {
				return units * 5.0f;
			}
		} else if (conn.equals(COMM_CONN)) {
			if (units <= 100) {
				return units * 4.25f > 350.0f ? units * 4.25f : 350.0f;
			} else if (units > 100 && units <= 300) {
				return units * 4.75f;
			} else if (units > 300 && units <= 500) {
				return units * 5.0f;
			} else {
				return units * 5.25f;
			}
		}
		return 0f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter the type of connection:\nPress 1 for Domestic Connection\nPress 2 for Commercial Connection");
		int type = sc.nextInt();
		String connection;
		if (type == 1) {
			connection = DOM_CONN;
		} else {
			connection = COMM_CONN;
		}
		System.out.println("Enter the units: ");
		int units = sc.nextInt();
		System.out.println("The bill: " + calElectricityBill(connection, units));

	}

}
