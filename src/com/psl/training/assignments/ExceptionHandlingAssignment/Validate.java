package com.psl.training.assignments.ExceptionHandlingAssignment;


public class Validate {
	
	
	public static void validateName(String firstName,String lastName) throws Exception{
		if(firstName.isEmpty()||lastName.isEmpty()) {
			Exception e=new Exception("First name or Last name missing!");
			throw e;
		}
	}
	
	public static void validateDOB(String dob) throws Exception{
		if(dob.isEmpty()) {
			Exception e=new Exception("Date of birth is missing!");
			throw e;
		}
		
	}
	
	public static void validateEmail(String email) throws Exception{
		if(email.isEmpty()) {
			Exception e=new Exception("email is missing!");
			throw e;
		}
		else {
				
				String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
				if(email.matches(regex)) {
					return;
				}
				else {
					Exception e=new Exception("email is wrong!");
					throw e;
				}
		}
	}
	
	public static void validateNumber(long  telephoneNumber,long  mobileNumber) throws Exception {
		if((telephoneNumber==0)&&(mobileNumber==0)) {
			Exception e=new Exception("Telephone number and mobile number is missing!");
			throw e;
		}
		
	}
	
}
