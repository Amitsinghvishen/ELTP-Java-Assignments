package com.psl.training.assignments.departmentOfCollege;

public class Person implements IPerson{
	private String name;
	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void displayDetails() {
		System.out.println("Name:"+this.getName());
	}

}
