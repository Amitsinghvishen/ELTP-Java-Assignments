package com.psl.training.assignments.AbcShopInventoryManagement;

public class TestInventoryManagement {

	public static void main(String[] args) {
		Product tally=new Software(1,"S001","Tally",2020,"Windows 10",4,2,true);
		tally.displayDetails();
		Product msOffice=new Software(2,"S002","MS Office",2020,"Windows 10",6,2,true);
		msOffice.displayDetails();
		Product laptop=new Hardware(7,"H001","Pavillion 15","HP","15x12x4",30);
		laptop.displayDetails();
	}
	

}
