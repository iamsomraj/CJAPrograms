package com.psl.training.assignment.invs;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

		System.out.println("Somraj's Inventory System:");

		CustomerService customerService = new CustomerService();
		List<Customer> customerList = customerService.getCustomers();

		Customer jamie = customerList.get(0);
		Customer bill = customerList.get(0);
		Customer joe = customerList.get(0);

		StockItemService stockItemService = new StockItemService();
		List<StockItem> listOfStockItems = stockItemService.getStockItems();
		StockItem milk = listOfStockItems.get(0);
		StockItem chicken = listOfStockItems.get(1);
		StockItem egg = listOfStockItems.get(2);
		StockItem apple = listOfStockItems.get(3);
		StockItem orange = listOfStockItems.get(4);

		OrderItem milkOrder1 = new OrderItem(12, milk);
		OrderItem chickenOrder1 = new OrderItem(2, chicken);
		OrderItem eggOrder1 = new OrderItem(12, egg);

		OrderItem[] orders1 = new OrderItem[] { milkOrder1, chickenOrder1, eggOrder1 };
		PurchaseOrder purchaseOrder1 = new PurchaseOrder(orders1);

		OrderItem appleOrder2 = new OrderItem(5, apple);
		OrderItem orangeOrder2 = new OrderItem(10, orange);

		OrderItem[] orders2 = new OrderItem[] { appleOrder2, orangeOrder2 };
		PurchaseOrder purchaseOrder2 = new PurchaseOrder(orders2);

		OrderItem chickenOrder3 = new OrderItem(5, chicken);
		OrderItem appleOrder3 = new OrderItem(10, apple);

		OrderItem[] orders3 = new OrderItem[] { chickenOrder3, appleOrder3 };
		PurchaseOrder purchaseOrder3 = new PurchaseOrder(orders3);

		purchaseOrder1.create(1, new Date());
		purchaseOrder2.create(2, new Date());
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
		jamie.setPrintingAddress("abc", "abc", "abc", "abc");
		bill.setPhoneNumbers("2222222222", "2222222222", "2222222222");
		bill.setPrintingAddress("def", "def", "def", "def");
		joe.setPhoneNumbers("3333333333", "3333333333", "3333333333");
		joe.setPrintingAddress("xyz", "xyz", "xyz", "xyz");

		jamie.setPurchaseOrder(new PurchaseOrder[] { purchaseOrder1, purchaseOrder3 });
		bill.setPurchaseOrder(new PurchaseOrder[] { purchaseOrder2 });

		System.out.println("Total sales of a customer: ");
		for (Customer cust : new Customer[] { jamie, bill, joe }) {
			System.out.println(cust.name.toUpperCase() + ":\t$" + cust.getTotalSales());
		}

		System.out.println("Customers: ");
		for (Customer cust : new Customer[] { jamie, bill, joe }) {
			System.out.println(cust);
		}

		System.out.println("Invoices: ");
		for (Customer cust : new Customer[] { jamie, bill, joe }) {
			cust.printInvoice();
		}

		System.out.println("Find orders placed by customer: ");
		System.out.println(Arrays.toString(customerService.findOrdersPlacedByCustomer(1)));

	}

}
