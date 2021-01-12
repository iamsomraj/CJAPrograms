package com.psl.training.assignment.oops;

import java.util.Scanner;

/**
 * Assignment 12.1.21 Abc shop deals with trading of various products. Every
 * product has product id, product name and serial number. Some products like
 * Microsoft Office , Tally etc. has different system requirements like OS,
 * Memory and also needs license key. Shop also deals with products like
 * Computers, Laptops, Car-Deck, Home Theater systems which has different
 * dimensions, capacity, brand, power supply requirements, battery backup, etc.
 * Develop hierarchy of various products Abstract classes, Concrete classes and
 * Interfaces as applicable.
 * 
 * (Note : Use appropriate additional fields wherever required.)
 * 
 * Implement this hierarchy using Java and Print Information of all products
 * with the help of Array.
 * 
 * @author Somraj Mukherjee
 *
 */
class Product {
	String productId;
	String productName;
	String serialNumber;

	public Product(String productId, String productName, String serialNumber) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", serialNumber=" + serialNumber
				+ "]";
	}

}

class Software extends Product {
	String operatingSystem;
	String memory;
	String licenseKey;

	public Software(String productId, String productName, String serialNumber, String operatingSystem, String memory,
			String licenseKey) {
		super(productId, productName, serialNumber);
		this.operatingSystem = operatingSystem;
		this.memory = memory;
		this.licenseKey = licenseKey;
	}

	@Override
	public String toString() {
		return "Software [operatingSystem=" + operatingSystem + ", memory=" + memory + ", licenseKey=" + licenseKey
				+ ", productId=" + productId + ", productName=" + productName + ", serialNumber=" + serialNumber + "]";
	}

}

class Hardware extends Product {
	String dimensions;
	String capacity;
	String brand;
	String powerSupplyRequirements;
	String batteryBackup;

	public Hardware(String productId, String productName, String serialNumber, String dimensions, String capacity,
			String brand, String powerSupplyRequirements, String batteryBackup) {
		super(productId, productName, serialNumber);
		this.dimensions = dimensions;
		this.capacity = capacity;
		this.brand = brand;
		this.powerSupplyRequirements = powerSupplyRequirements;
		this.batteryBackup = batteryBackup;
	}

	@Override
	public String toString() {
		return "Hardware [dimensions=" + dimensions + ", capacity=" + capacity + ", brand=" + brand
				+ ", powerSupplyRequirements=" + powerSupplyRequirements + ", batteryBackup=" + batteryBackup
				+ ", productId=" + productId + ", productName=" + productName + ", serialNumber=" + serialNumber + "]";
	}

}

public class ShopUtil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products: ");
		Product products[] = new Product[Integer.parseInt(sc.nextLine())];
		for (int i = 0; i < products.length; i++) {
			System.out.println("Enter 1 for Software: \nEnter 2 for Hardware: ");
			switch (Integer.parseInt(sc.nextLine())) {
			case 1:
				System.out.println("Enter details for Software:\n\n");
				System.out.println("Product ID: ");
				String productId = sc.nextLine();
				System.out.println("Product Name: ");
				String productName = sc.nextLine();
				System.out.println("Serial Number: ");
				String serialNumber = sc.nextLine();
				System.out.println("Operating System: ");
				String operatingSystem = sc.nextLine();
				System.out.println("Memory: ");
				String memory = sc.nextLine();
				System.out.println("License Key: ");
				String licenseKey = sc.nextLine();
				products[i] = new Software(productId, productName, serialNumber, operatingSystem, memory, licenseKey);
				break;

			case 2:
				System.out.println("Enter details for Hardware:\n\n");
				System.out.println("Product ID: ");
				String productId2 = sc.nextLine();
				System.out.println("Product Name: ");
				String productName2 = sc.nextLine();
				System.out.println("Serial Number: ");
				String serialNumber2 = sc.nextLine();
				System.out.println("Dimensions: ");
				String dimensions = sc.nextLine();
				System.out.println("Capacity: ");
				String capacity = sc.nextLine();
				System.out.println("Brand: ");
				String brand = sc.nextLine();
				System.out.println("Power Supply Requirements:");
				String powerSupplyRequirements = sc.nextLine();
				System.out.println("Battery Backup: ");
				String batteryBackup = sc.nextLine();
				products[i] = new Hardware(productId2, productName2, serialNumber2, dimensions, capacity, brand,
						powerSupplyRequirements, batteryBackup);
				break;

			}
		}

		System.out.println("Products are displayed: ");
		for (Product pdt : products) {
			System.out.println(pdt);
		}
	}

}
