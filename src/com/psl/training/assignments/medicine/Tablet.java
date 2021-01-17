package com.psl.training.assignments.medicine;

public class Tablet extends Medicine{
	private String storage;
	
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public Tablet(String name, String address, String storage) {
		super(name, address);
		this.setStorage(storage);
	}
	@Override
	public void displayLabel() {
		System.out.println("Name:"+this.getName());
		System.out.println("Address:"+this.getAddress());
		System.out.println("Storage:"+this.getStorage());
	}
}
