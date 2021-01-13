package com.psl.training.assignment.csoops.shapes;

public class Triangle extends Shape implements Rotatable {

	@Override
	public void draw() {
		System.out.println("Triangle is drawn");
	}

	public void rotate() {
		System.out.println("Triangle is rotating...");
	}
}