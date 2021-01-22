package com.psl.training.assignments.InventorySystem;

import java.sql.Date;

public class Test {
	public static void main(String[] args) {
		Customer c1=new Customer(1,"Jamie");
		Customer c2=new Customer(2,"Bill");
		Customer c3=new Customer(3,"Joe");
		
		StockItem milk=new StockItem(1,"Milk",50);
		StockItem chicken=new StockItem(2,"Chicken",250);
		StockItem egg=new StockItem(3,"Egg",7);
		StockItem apple=new StockItem(4,"Apple",15);
		StockItem orange=new StockItem(5,"Orange",10);
		
	}
}