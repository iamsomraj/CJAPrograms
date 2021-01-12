package com.psl.training.assignment.oops;

class Animal {
	private String name;
	private String color;

	/**
	 * We can invoke static block even before instance block. Static gets invoked
	 * only one time no matter how many objects you create
	 */
	static {
		System.out.println("Static");
	}

	/**
	 * We can use instance block for giving default values. This is invoked even
	 * before constructor of any type
	 */

	{
		this.name = "Python";
		this.color = "Brown Prints";
		System.out.println("Instance");
	}

	/**
	 * Constructors always return the reference of the same class. This is a
	 * parameterised constructor
	 * 
	 * @param name
	 * @param color
	 */
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
		System.out.println("Param. Cons.");
	}

	/**
	 * Default Constructor is added by compiler
	 */
	public Animal() {
		super();
		System.out.println("Default. Cons.");
	}

	/**
	 * Getter methods are called accessor methods
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter methods are called mutator methods
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class Kitten extends Cat {

}

/**
 * Day 3 Date 11.1.21 Hands On Session Assignment
 * 
 * @author Somraj Mukherjee
 *
 */
public class AnimalUtil {

	public static void main(String[] args) {
		Animal tiger = new Animal("Tiger", "Yellow");
		Animal zebra = new Animal("Zebra", "Black and White");
		System.out.println(tiger);
		System.out.println(zebra);
	}

}
