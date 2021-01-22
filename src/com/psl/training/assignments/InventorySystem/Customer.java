package com.psl.training.assignments.InventorySystem;

public class Customer {
	
	private int customerNumber;
	private String Name;
	private String homePhone;
	private String cellPhone;
	private String workPhone;
	private String street;
	private String city;
	private String state;
	private String zip;
	PurchaseOrder[] pO;
	
	public Customer(int customerNumber,String name) {
		this.setCustomerNumber(customerNumber);
		this.setName(name);
	}
	
	public void printPhoneNumbers() {
		System.out.println("Home phone number:"+this.getHomePhone());
		System.out.println("Cell phone number:"+this.getCellPhone());
		System.out.println("Work phone number:"+this.getWorkPhone());
	}
	
	public void printShippingAddress() {
		System.out.println("Shipping Address:"+this.getStreet()+","+this.getCity()+","+this.getState()+","+this.getZip());
	}
	
	public void setPrinitingAddress(String street,String city,String state,String zip) {
		this.setCity(city);
		this.setStreet(street);
		this.setState(state);
		this.setZip(zip);
	}
	
	public void setPhoneNumber(String homePhone,String cellPhone,String workPhone) {
		this.setCellPhone(cellPhone);
		this.setHomePhone(homePhone);
		this.setWorkPhone(workPhone);
	}
	
	public void print() {
		System.out.println("Customer no:"+this.getCustomerNumber());
		System.out.println("Customer name:"+this.getName());
		this.printPhoneNumbers();
		this.printShippingAddress();
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public PurchaseOrder[] getpO() {
		return pO;
	}

	public void setpO(PurchaseOrder[] pO) {
		this.pO = pO;
	}


}
