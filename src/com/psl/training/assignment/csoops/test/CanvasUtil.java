package com.psl.training.assignment.csoops.test;

import com.psl.training.assignment.csoops.canvas.GameConsole;
import com.psl.training.assignment.csoops.shapes.Circle;
import com.psl.training.assignment.csoops.shapes.Shape;
import com.psl.training.assignment.csoops.shapes.Square;
import com.psl.training.assignment.csoops.shapes.Star;
import com.psl.training.assignment.csoops.shapes.Triangle;

/**
 * Date 13.1.21 Java Hands On Session Case Study Assignment
 * 
 * @author Somraj Mukherjee
 *
 */
public class CanvasUtil {
	public static void main(String[] args) {
		Shape triangle = new Triangle();
		Shape square = new Square();
		Shape circle = new Circle();
		Shape star = new Star();
		GameConsole gc = new GameConsole();
		gc.drawOnCanvas(triangle);
		gc.drawOnCanvas(square);
		gc.drawOnCanvas(circle);
		gc.drawOnCanvas(star);
	}
}
