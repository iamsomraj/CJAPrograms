package com.psl.training.assignment.calc;

import java.util.Scanner;

import com.psl.training.assignment.calc.CalculatorService.Operations;

public class CalUtil {

	public static void main(String[] args) {
		int ch = 889;
		Scanner sc = new Scanner(System.in);
		System.out.println("Somraj's Utility Calculator:");
		do {
			System.out.println(
					"Enter 1 for Addition:\nEnter 2 for Subtraction:\nEnter 3 for Multiply:\nEnter 4 for Divison:\nEnter 5 for Exit:\n");
			ch = sc.nextInt();
			if (ch == 5) {
				System.out.println("\n\nExiting....");
				return;
			}
			CalculatorService cs = new CalculatorService();
			System.out.println("Enter first variable: ");
			int a = sc.nextInt();
			System.out.println("Enter second variable: ");
			int b = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Addition: ");
				System.out.println("Result: " + cs.performCalculation(Operations.ADD, a, b));
				break;
			case 2:
				System.out.println("Subtraction: ");
				System.out.println("Result: " + cs.performCalculation(Operations.SUB, a, b));
				break;
			case 3:
				System.out.println("Multiply: ");
				System.out.println("Result: " + cs.performCalculation(Operations.MULTIPLY, a, b));
				break;
			case 4:
				System.out.println("Division: ");
				System.out.println("Result: " + cs.performCalculation(Operations.DIVISION, a, b));
				break;
			default:
				System.out.println("Invalid Input");
				System.out.println("Try Again");
			}
		} while (ch != 6);
	}

}
