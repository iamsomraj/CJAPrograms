package com.psl.training.assignment.calc;


public class CalculatorService {
	public enum Operations {
		ADD, SUB, MULTIPLY, DIVISION
	};

	Calculator calculator = new Calculator();

	public int performCalculation(Operations op, int a, int b) {
		try {
			switch (op) {
			case ADD:
				return calculator.add(a, b);
			case SUB:
				return calculator.sub(a, b);
			case MULTIPLY:
				return calculator.mult(a, b);
			case DIVISION:
				return calculator.div(a, b);
			}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
		return 0;
	}

}
