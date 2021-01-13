package com.psl.training.assignment.csoops.canvas;

import com.psl.training.assignment.csoops.shapes.Bouncable;
import com.psl.training.assignment.csoops.shapes.Circle;
import com.psl.training.assignment.csoops.shapes.Rotatable;
import com.psl.training.assignment.csoops.shapes.Shape;
import com.psl.training.assignment.csoops.shapes.Sparkable;

public class GameConsole {
	public void drawOnCanvas(Shape shape) {
		shape.draw();
		if (shape instanceof Circle) {
			((Circle) shape).fillColor("Red");
		}
		if (shape instanceof Sparkable) {
			((Sparkable) shape).sparkle();
		}
		if (shape instanceof Bouncable) {
			((Bouncable) shape).bounce();
		}
		if (shape instanceof Rotatable) {
			((Rotatable) shape).rotate();
		}
	}
}