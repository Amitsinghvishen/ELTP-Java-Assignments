package com.psl.training.assignments.InventorySystem;

import java.sql.Date;

public class PurchaseOrder {
	private int poNumber;
	private Date orderDate;
	private Date shipDate;
	

	
	public boolean isShipped() {
		
	}
	
	public double sumItems() {
		
	}
	
	public void setShipDate(Date date) {
		this.shipDate=date;
	}
	
	public void create(int poNumber, Date orderDate){
		this.poNumber=poNumber;
		this.orderDate=orderDate;
	}
	
	public OrderItem[] getItems() {
		
	}
}
