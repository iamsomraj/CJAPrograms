package com.psl.training.assignment.csoops.shapes;

public class Circle extends Shape implements Bouncable {
	@Override
	public void draw() {
		System.out.println("Circle is drawn");
	}

	public void bounce() {
		System.out.println("Circle is bouncing...");
	}
	
	public void fillColor(String str) {
		System.out.println("Circle is filled with " + str);
	}

}