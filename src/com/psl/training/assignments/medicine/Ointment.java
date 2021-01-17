package com.psl.training.assignments.medicine;

public class Ointment extends Medicine{

	private String skinType;
	
	public String getSkinType() {
		return skinType;
	}

	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	public Ointment(String name, String address,String skinType) {
		super(name, address);
		this.setSkinType(skinType);
	}
	public void displayLabel() {
		System.out.println("Name:"+this.getName());
		System.out.println("Address:"+this.getAddress());
		System.out.println("Skin Type:"+this.getSkinType());
	}
}
