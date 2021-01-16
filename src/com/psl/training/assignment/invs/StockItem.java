package com.psl.training.assignment.invs;

public class StockItem {
	int itemNumber;
	String itemDescription;
	double itemPrice;
	int quantity;
	String unit;

	enum Unit {
		KG, GALLON, NO, GM;
	}

	public StockItem(int itemNumber, String itemDescription, double itemPrice, int quantity, Unit unit) {
		super();
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		if (unit == Unit.KG) {
			this.unit = "kilograms";
		} else if (unit == Unit.GALLON) {
			this.unit = "gallons";
		} else if (unit == Unit.GM) {
			this.unit = "grams";
		} else if (unit == Unit.NO) {
			this.unit = "numbers";
		}
	}

	@Override
	public String toString() {
		return "StockItem [id: " + itemNumber + ", desc: " + itemDescription + ", price: " + itemPrice + ", qty: "
				+ quantity + " " + unit + "]";
	}

	int getQuantity() {
		return quantity;
	}
}
