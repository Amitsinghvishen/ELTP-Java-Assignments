package com.psl.training.assignments.departmentOfCollege;

public class Faculty extends Person implements Salaried{
	private String department;
	private int salary;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void setSalary(int salary) {
		this.salary=salary;
		
	}

	@Override
	public int getSalary() {
		return this.salary;
	}
	
}
