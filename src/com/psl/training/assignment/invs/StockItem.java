package com.psl.training.assignment.invs;

public class StockItem {
	int itemNumber;
	String itemDescription;
	double itemPrice;
	int quantity;
	String unit;

	public StockItem(int itemNumber, String itemDescription, double itemPrice, int quantity, String unit) {
		super();
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.unit = unit;
	}

	int getQuantity() {
		return quantity;
	}
}
