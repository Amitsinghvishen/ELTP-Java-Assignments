package com.psl.training.assignments.OrderManagementSystem;

public class Customer {
	private int id;
	private String name;
	private int homePhone;
	private int cellPhone;
	private int workPhone;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Customer(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void displayDetails() {
		System.out.println("------------------------------------");
		System.out.println("Customer ID:"+this.getId());
		System.out.println("Customer Name:"+this.getName());
		this.printPhoneNumbers();
		this.printShippingAddress();
	}
	
	public void setPrintAddress(String street,String city,String state,int zip) {
		this.setCity(city);
		this.setState(state);
		this.setZip(zip);
		this.setStreet(street);
	}
	
	public void printShippingAddress() {
		System.out.println("Shipping address:"+street+","+city+","+state+","+zip);
	}
	
	public void setPhoneNumbers(int homePhone,int cellPhone,int workPhone) {
		this.setCellPhone(cellPhone);
		this.setHomePhone(homePhone);
		this.setWorkPhone(workPhone);
	}
	
	public void printPhoneNumbers() {
		System.out.println("Cell phone number:"+this.getCellPhone());
		System.out.println("Home phone number:"+this.getHomePhone());
		System.out.println("Work phone number:"+this.getWorkPhone());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(int homePhone) {
		this.homePhone = homePhone;
	}
	public int getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(int cellPhone) {
		this.cellPhone = cellPhone;
	}
	public int getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(int workPhone) {
		this.workPhone = workPhone;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	

}
