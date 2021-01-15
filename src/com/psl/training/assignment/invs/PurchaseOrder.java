package com.psl.training.assignment.invs;

import java.util.Date;

public class PurchaseOrder {
	int poNumber;
	Date orderDate;
	Date shipDate;
	OrderItem[] orderItems;

	public PurchaseOrder(int poNumber, Date orderDate, Date shipDate, OrderItem[] orderItem) {
		super();
		this.poNumber = poNumber;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.orderItems = orderItem;
	}

	boolean isShipped() {
		return false;
	}

	double sumItems() {
		double sum = 0d;
		for (int i = 0; i < orderItems.length; i++) {
			OrderItem orderItem = orderItems[i];
			sum = sum + orderItem.getTotal();
		}
		return sum;
	}

	void setShipDate(Date date) {
		this.shipDate = date;
	}

	void create(int poNumber, Date date) {
		this.poNumber = poNumber;
		this.orderDate = date;
	}

	OrderItem[] getItems() {
		return orderItems;

	}
}
