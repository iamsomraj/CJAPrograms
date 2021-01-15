package com.psl.training.assignment.invs;

import java.util.Date;

import com.psl.training.assignment.oms.Customer;

/**
 * Date 15.1.21 Assignment Create StockItem class
 * 
 * Create PurchaseOrder class
 * 
 * Create OrderItem class
 * 
 * Create Test class that does the following - 
 * 
 * Create 3 customers - Jamie, Bill, Joe
 * 
 * Create 5 items - Milk, Chicken, Egg, Apple and Orange
 * 
 * Create 3 Purchase Orders. 2 for Jamie, 1 for Bill and None for Joe.
 * 
 * PO 1 - 2 gallons Milk, 2 lbs Chicken and 12 eggs.
 * 
 * PO 2 - 5 apples and 10 oranges
 * 
 * PO 3 - 5 Lbs chicken and 10 apples
 * 
 * Get all the orders to be shipped and print labels
 * 
 * Ship first order for Jamie
 * 
 * Ship Bill’s order
 * 
 * Ship Jamie’s order
 * 
 * Print total sales by customer
 * 
 * Print all invoices (include customer, Order date, line items with count and
 * price, sum for the invoice at the bottom)
 * 
 * 
 * @author Somraj Mukherjee
 *
 */
public class InventoryUtil {

	public static void main(String[] args) {

		Customer jamie = new Customer(1, "Jamie");
		Customer bill = new Customer(2, "Bill");
		Customer joe = new Customer(3, "Joe");

		StockItem milk = new StockItem(1, "Milk", 100, 50, "gallon");
		StockItem chicken = new StockItem(2, "Chicken", 100, 50, "kg");
		StockItem egg = new StockItem(3, "Egg", 100, 50, "number");
		StockItem apple = new StockItem(4, "Apple", 100, 50, "number");
		StockItem orange = new StockItem(5, "Orange", 100, 50, "number");

		OrderItem milkOrder1 = new OrderItem(12, milk);
		OrderItem chickenOrder1 = new OrderItem(2, chicken);
		OrderItem eggOrder1 = new OrderItem(12, egg);


	}

}
