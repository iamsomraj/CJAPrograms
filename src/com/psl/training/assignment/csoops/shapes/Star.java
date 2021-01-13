package com.psl.training.assignment.csoops.shapes;

public class Star extends Shape implements Sparkable {

	@Override
	public void draw() {
		System.out.println("Star is drawn");
	}

	public void sparkle() {
		System.out.println("Star is sparkling....");
	}

}
