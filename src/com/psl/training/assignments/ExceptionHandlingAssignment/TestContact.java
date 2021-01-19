package com.psl.training.assignments.ExceptionHandlingAssignment;

;

public class TestContact {

	public static void main(String[] args) {
		Contact c1=new Contact("Amit","Singh");
		c1.setDob("03/10/1998");
		c1.setMobileNumber(8962558988l);
		c1.setEmail("amit@gmail.com");
		try {
		c1.validate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Fine");
		
		
		// Stack
		
		Stack s=new Stack(2);
		try {
		s.push(c1);
		s.print();
		s.pop();
		s.print();
		s.pop();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
