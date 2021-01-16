package com.psl.training.assignment.invs;

import java.util.Date;

import com.psl.training.assignment.invs.StockItem.Unit;

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

		StockItem milk = new StockItem(1, "Milk", 100, 50, Unit.GALLON);
		StockItem chicken = new StockItem(2, "Chicken", 100, 50, Unit.KG);
		StockItem egg = new StockItem(3, "Egg", 100, 50, Unit.NO);
		StockItem apple = new StockItem(4, "Apple", 100, 50, Unit.NO);
		StockItem orange = new StockItem(5, "Orange", 100, 50, Unit.NO);

		OrderItem milkOrder1 = new OrderItem(12, milk);
		OrderItem chickenOrder1 = new OrderItem(2, chicken);
		OrderItem eggOrder1 = new OrderItem(12, egg);

		OrderItem[] orders1 = new OrderItem[] { milkOrder1, chickenOrder1, eggOrder1 };
		PurchaseOrder purchaseOrder1 = new PurchaseOrder(orders1);
		purchaseOrder1.create(1, new Date());

		OrderItem appleOrder2 = new OrderItem(5, apple);
		OrderItem orangeOrder2 = new OrderItem(10, orange);

		OrderItem[] orders2 = new OrderItem[] { appleOrder2, orangeOrder2 };
		PurchaseOrder purchaseOrder2 = new PurchaseOrder(orders2);
		purchaseOrder2.create(2, new Date());

		OrderItem chickenOrder3 = new OrderItem(5, chicken);
		OrderItem appleOrder3 = new OrderItem(10, apple);

		OrderItem[] orders3 = new OrderItem[] { chickenOrder3, appleOrder3 };
		PurchaseOrder purchaseOrder3 = new PurchaseOrder(orders3);
		purchaseOrder3.create(3, new Date());

		long time = System.currentTimeMillis();
		long day = 24 * 60 * 60 * 1000;
		purchaseOrder1.setShipDate(new Date(time + 1 * day));
		purchaseOrder2.setShipDate(new Date(time + 2 * day));
		purchaseOrder3.setShipDate(new Date(time + 5 * day));

		System.out.println("Purchase Orders are displayed: ");
		System.out.println(purchaseOrder1);
		System.out.println(purchaseOrder2);
		System.out.println(purchaseOrder3);

		jamie.setPhoneNumbers("1111111111", "1111111111", "1111111111");
		jamie.setPrintingAddress("11", "11", "11", "11");
		bill.setPhoneNumbers("22222222", "22222222", "2222222222");
		bill.setPrintingAddress("22", "22", "22", "22");
		joe.setPhoneNumbers("3333333333", "3333333333", "3333333333");
		joe.setPrintingAddress("33", "33", "33", "33");

		jamie.setPurchaseOrder(new PurchaseOrder[] { purchaseOrder1, purchaseOrder3 });
		bill.setPurchaseOrder(new PurchaseOrder[] { purchaseOrder2 });

		System.out.println("Total sales of a customer: ");
		for (Customer cust : new Customer[] { jamie, bill, joe }) {
			System.out.println(cust.name.toUpperCase() + ":\t" + cust.getTotalSales());
		}

		System.out.println("Customers: ");
		for (Customer cust : new Customer[] { jamie, bill, joe }) {
			System.out.println(cust);
		}

		System.out.println("Invoices: \n");
		for (Customer cust : new Customer[] { jamie, bill, joe }) {
			cust.printInvoice();
		}

	}

}
