package com.psl.training.assignment.invs;

public class OrderItem {
	int numberOfItems;
	StockItem stockItem;

	public OrderItem(int numberOfItems, StockItem stockItem) {
		super();
		this.numberOfItems = numberOfItems;
		this.stockItem = stockItem;
	}

	double getTotal() {
		return stockItem.itemPrice * numberOfItems;
	}

	@Override
	public String toString() {
		return "\n\nOrderItem\n[numberOfItems=" + numberOfItems + ",\n stockItem=" + stockItem + "\n]";
	}

}