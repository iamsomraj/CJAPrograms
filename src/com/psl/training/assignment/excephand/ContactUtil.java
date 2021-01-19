package com.psl.training.assignment.excephand;

import java.util.Scanner;

public class ContactUtil {

	public static void main(String[] args) {
		ContactStack contactStack = new ContactStack();
		int ch;
		System.out.println("Stack console: ");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\nEnter 1 for PUSH:\nEnter 2 for POP:\nEnter 3 for DISPLAY:\nEnter 4 for EXIT:");
			ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				System.out.println("Push:\nEnter details for a new contact:\n");
				System.out.println("Enter first name: ");
				String firstName = sc.nextLine();
				System.out.println("Enter last name: ");
				String lastName = sc.nextLine();
				System.out.println("Enter date of birth: ");
				String dateOfBirth = sc.nextLine();
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				Contact cont = new Contact(firstName, lastName, dateOfBirth, email);
				System.out.println("Want to add telephone? Press 1 for Yes");
				int teleChoice = Integer.parseInt(sc.nextLine());
				if (teleChoice == 1) {
					System.out.println("Enter telephone number: ");
					cont.setTelephoneNumber(sc.nextLine());
				}
				System.out.println("Want to add mobile phone? Press 1 for Yes");
				int mobChoice = Integer.parseInt(sc.nextLine());
				if (mobChoice == 1) {
					System.out.println("Enter mobile number: ");
					cont.setMobileNumber(sc.nextLine());
				}
				try {
					contactStack.push(cont);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Pop: ");
				try {
					contactStack.pop();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Display: ");
				try {
					contactStack.display();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Exiting.....");
				System.exit(033670);
			}
		} while (ch != 3);

	}

}
