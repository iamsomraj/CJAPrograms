package com.psl.training.assignment.sma;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Assignment Date 10.1.21 Ezee Shop has an online portal where customers can
 * check about different products. Customers can search for products by giving a
 * key word. Write a program that accepts a product name and a key word, and
 * checks if the key word is present in the given product name.
 * 
 * @author Somraj Mukherjee
 *
 */
public class IsPresentUtil {

	public static HashMap<String, String> shop = new HashMap<String, String>();

	/**
	 * Initialises the shop and returns all the product names
	 * 
	 * @return String[]
	 */
	public static String[] initProductNames() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products: ");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("Enter details of each product one by one");
		for (int i = 0; i < no; i++) {
			System.out.println("Enter the name of product: ");
			String pdt = sc.nextLine();
			System.out.println("Enter the keyword for product: " + pdt + ": ");
			String keyword = sc.nextLine();
			shop.put(pdt, keyword);
		}
		String pdts[] = new String[shop.size()];
		int k = 0;
		for (String pdt : shop.keySet()) {
			pdts[k] = pdt;
			k++;
		}
		return pdts;
	}

	/**
	 * Checks if the keyword is present for a product or not
	 * 
	 * @param productNames
	 * @param keyword
	 * @return boolean
	 */
	public static boolean isPresent(String[] productNames, String keyword) {
		for (String pdt : productNames) {
			if (shop.get(pdt).equals(keyword)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String productNames[] = initProductNames();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the keyword for searching: ");
		String keyword = sc.nextLine();
		if (isPresent(productNames, keyword)) {
			System.out.println("Keyword " + keyword + " is present");
		} else {
			System.out.println("Sorry, keyword " + keyword + " is not present");
		}

	}

}
