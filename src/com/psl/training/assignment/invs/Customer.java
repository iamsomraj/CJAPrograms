package com.psl.training.assignment.invs;

import java.util.Arrays;

public class Customer {
	int id;
	String name, homePhone, cellPhone, workPhone, street, city, state, zip;
	PurchaseOrder[] purchaseOrders;

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", homePhone=" + homePhone + ", cellPhone=" + cellPhone
				+ ", workPhone=" + workPhone + ", street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", purchaseOrders=" + Arrays.toString(purchaseOrders) + "]";
	}

	void printPhoneNumbers() {
		System.out.println(
				"Customer [ homePhone=" + homePhone + ", cellPhone=" + cellPhone + ", workPhone=" + workPhone + "]");
	}

	void printShippingAddress() {
		System.out.println("Customer [street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]");
	}

	void setPrintingAddress(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	void setPhoneNumbers(String homePhone, String cellPhone, String workPhone) {
		this.homePhone = homePhone;
		this.cellPhone = cellPhone;
		this.workPhone = workPhone;
	}

	void printCustomerFields() {
		System.out.println(this.toString());
	}

	void print() {
		printCustomerFields();
	}

	void printInvoice() {
		System.out.println("Invoice for " + name.toUpperCase() + ": ");
		if (purchaseOrders != null) {
			for (int i = 0; i < purchaseOrders.length; i++) {
				PurchaseOrder purchaseOrder = purchaseOrders[i];
				System.out.println(
						purchaseOrder.orderDate + " - " + purchaseOrder.shipDate + " $" + purchaseOrder.sumItems());
			}
		}
		System.out.println("Total: $" + getTotalSales());
	}

	double getTotalSales() {
		double sum = 0;
		if (purchaseOrders == null) {
			return 0d;
		}
		for (int i = 0; i < purchaseOrders.length; i++) {
			PurchaseOrder purchaseOrder = purchaseOrders[i];
			sum += purchaseOrder.sumItems();
		}
		return sum;
	}

	PurchaseOrder[] getPurchaseOrder() {
		return purchaseOrders;
	}

	void setPurchaseOrder(PurchaseOrder[] orders) {
		this.purchaseOrders = orders;
	}

}