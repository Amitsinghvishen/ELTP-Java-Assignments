package com.psl.training.assignments.OrderManagementSystem;

public class CustomerTest {
	

	public static void main(String[] args) {
		Customer c1=new Customer(1,"Akshat Nahar");
		c1.setPhoneNumbers(123456789, 234567890, 987654321);
		c1.setPrintAddress("Lake view", "Bhopal", "M.P.", 421001);
		c1.displayDetails();
		Customer c2=new Customer(2,"Aditya Payasi");
		c2.setPhoneNumbers(454564,5654654,232124);
		c2.setPrintAddress("Irrigation colony", "Chhatarpur", "M.P.", 471001);
		c2.displayDetails();
		Customer c3=new Customer(3,"Amit Singh");
		c3.setPhoneNumbers(878121422, 765652365, 456456512);
		c3.setPrintAddress("Sagar road", "Chhatarpur", "M.P.", 471001);
		c3.displayDetails();
	}

}
