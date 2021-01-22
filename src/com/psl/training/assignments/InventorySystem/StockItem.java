package com.psl.training.assignments.InventorySystem;

public class StockItem {
	private int itemNumber;
	private String itemDescription;
	private double itemPrice;
	
	public StockItem(int itemNumber,String itemDescription,double itemPrice) {
		this.setItemNumber(itemNumber);
		this.setItemDescription(itemDescription);
		this.setItemPrice(itemPrice);
	}
	
	public int getQuantity() {
		int quantity=0;
		return quantity;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

}
