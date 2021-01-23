package com.psl.training.assignment.invs;

import java.io.FileReader;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

	private List<Customer> customers = new ArrayList<Customer>();
	private String fileName = "src/com/psl/training/assignment/invs/customer-info.txt";

	public Customer createCustomer(String str[]) {
		return new Customer(Integer.parseInt(str[0].trim()), str[1].trim());
	}

	public CustomerService() {
		super();
		try {
			FileReader file = new FileReader(fileName);
			int ch;
			String fileContent = "";
			while ((ch = file.read()) != -1) {
				fileContent += (char) ch;
			}
			if (fileContent.isBlank() || fileContent.isEmpty()) {
				file.close();
				throw new InsufficientDataException("Data is insufficient: Customer");
			}
			String persons[] = fileContent.split("\n");
			for (String cust : persons) {
				String values[] = cust.split(",");
				Customer fetchedItem = createCustomer(values);
				this.customers.add(fetchedItem);
			}
			System.out.println("Data fetched succesfully: Customer");
			file.close();
		} catch (Exception e) {
			System.out.println("Data fetch failed: Customer");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public PurchaseOrder[] findOrdersPlacedByCustomer(int customerId) {
		Customer customer = null;
		for (Customer cust : customers) {
			if (cust.getId() == customerId) {
				customer = cust;
				break;
			}
		}
		return customer.purchaseOrders.length == 0 ? null : customer.purchaseOrders;
	}

	public PurchaseOrder[] findOrdersToBeShippedOn(Date findDate) {
		List<PurchaseOrder> orders = new ArrayList<PurchaseOrder>();
		for (Customer cust : customers) {
			PurchaseOrder[] arrayOfOrders = cust.getPurchaseOrders();
			if (arrayOfOrders != null) {
				for (PurchaseOrder ord : arrayOfOrders) {
					if (ord.shipDate.compareTo(findDate) == 0) {
						orders.add(ord);
					}
				}
			}
		}
		PurchaseOrder[] fetchedOrders = new PurchaseOrder[orders.size()];
		int k = 0;
		for (PurchaseOrder prd : orders) {
			fetchedOrders[k] = prd;
			k++;
		}
		return fetchedOrders;
	}

}
