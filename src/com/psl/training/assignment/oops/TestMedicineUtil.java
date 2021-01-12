package com.psl.training.assignment.oops;

import java.util.Scanner;

/**
 * Assignment Date 12.1.21 Create a class Medicine to represent a drug manufactured by a pharmaceutical
 * company. Provide a function displayLabel() in this class to print Name and
 * address of the company.
 * 
 * Derive Tablet, Syrup and Ointment classes from the Medicine class. Override
 * the displayLabel() function in each of these classes to print additional
 * information suitable to the type of medicine. For example, in case of
 * tablets, it could be “store in a cool dry place”, in case of ointments it
 * could be “for external use only” etc.
 * 
 * Create a class TestMedicine. Write main function to do the following:
 * 
 * Declare an array of Medicine references of size 10
 * 
 * Create a medicine object of the type as decided by a randomly generated
 * integer in the range 1 to 3.
 * 
 * Refer Java API Documentation to find out random generation feature.
 * 
 * Check the polymorphic behavior of the displayLabel() method.
 * 
 * @author Somraj Mukherjee
 *
 */
class Medicine {
	private String name;
	private String address;

	public Medicine(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String displayLabel() {
		return "Medicine [name=" + name + ", address=" + address + "]";
	}

}

class Tablet extends Medicine {
	private String storageInfo;

	public Tablet(String name, String address, String storageInfo) {
		super(name, address);
		this.storageInfo = storageInfo;
	}

	@Override
	public String displayLabel() {
		return "Tablet [name=" + super.getName() + ", address=" + super.getAddress() + ", storageInfo=" + storageInfo
				+ "]";
	}
}

class Syrup extends Medicine {
	private String dosageInfo;

	public Syrup(String name, String address, String dosageInfo) {
		super(name, address);
		this.dosageInfo = dosageInfo;
	}

	@Override
	public String displayLabel() {
		return "Syrup [name=" + super.getName() + ", address=" + super.getAddress() + ", dosageInfo=" + dosageInfo
				+ "]";
	}

}

class Ointment extends Medicine {
	private String usageInfo;

	public Ointment(String name, String address, String usageInfo) {
		super(name, address);
		this.usageInfo = usageInfo;
	}

	@Override
	public String displayLabel() {
		return "Ointment [name=" + super.getName() + ", address=" + super.getAddress() + ", usageInfo=" + usageInfo
				+ "]";
	}

}

public class TestMedicineUtil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of medicines: ");
		int number = Integer.parseInt(sc.nextLine());
		Medicine arr[] = new Medicine[number];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the name: ");
			String name = sc.nextLine();
			System.out.println("Enter the address: ");
			String address = sc.nextLine();
			int random = (int) (Math.round(Math.random() * 2 + 1));
			switch (random) {
			case 1:
				System.out.println("Enter the storage information for Tablet: ");
				String storageInfo = sc.nextLine();
				arr[i] = new Tablet(name, address, storageInfo);
				break;
			case 2:
				System.out.println("Enter the dosage information for Syrup: ");
				String dosageInfo = sc.nextLine();
				arr[i] = new Syrup(name, address, dosageInfo);
				break;
			case 3:
				System.out.println("Enter the usage information for Ointment: ");
				String usageInfo = sc.nextLine();
				arr[i] = new Ointment(name, address, usageInfo);
				break;
			}
		}
		System.out.println("The labels of medicine are displayed: ");
		for (Medicine mdc : arr) {
			System.out.println(mdc.displayLabel());
		}
	}

}
