package com.psl.training.assignments.medicine;

public class Medicine {

	private String name;
	private String address;
	
	public Medicine(String name,String address) {
		this.name=name;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void displayLabel() {
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	}
}
