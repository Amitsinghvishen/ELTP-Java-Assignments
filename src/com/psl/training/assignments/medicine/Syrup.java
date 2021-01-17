package com.psl.training.assignments.medicine;

public class Syrup extends Medicine{
	private String flavour;
	
	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public Syrup(String name, String address,String flavour) {
		super(name, address);
		this.setFlavour(flavour);
	}
	public void displayLabel() {
		System.out.println("Name:"+this.getName());
		System.out.println("Address:"+this.getAddress());
		System.out.println("Flavour:"+this.getFlavour());
	}
}
