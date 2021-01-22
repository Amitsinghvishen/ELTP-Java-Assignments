package com.psl.training.assignments.InventorySystem;

public class OrderItem {
	public OrderItem(StockItem stockItem, int numberOfItems, int total) {
		super();
		this.stockItem = stockItem;
		this.numberOfItems = numberOfItems;
		this.total = total;
	}

	private StockItem stockItem;
	private int numberOfItems;
	private int total;
	
	public int getTotal() {
		return this.total;
	}
}
