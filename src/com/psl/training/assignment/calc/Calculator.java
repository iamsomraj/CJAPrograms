package com.psl.training.assignment.calc;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Calculator {

	static Logger logger = Logger.getLogger(Calculator.class.getName());

	static {
		try {
			logger.addHandler(new FileHandler("myLogs.xml"));
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) throws Exception {
		try {
			return a / b;
		} catch (Exception e) {
			logger.info("Exception: " + e.getMessage());
			throw e;
		}
	}

	public int sub(int a, int b) {
		return a - b;
	}
}
