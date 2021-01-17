package com.psl.training.assignments.departmentOfCollege;

public class UGFaculty extends Faculty {
	private String ugSubjectSpecialization;

	public String getUgSubjectSpecialization() {
		return ugSubjectSpecialization;
	}

	public void setUgSubjectSpecialization(String ugSubjectSpecialization) {
		this.ugSubjectSpecialization = ugSubjectSpecialization;
	}
	
	public UGFaculty(String name,int salary,String department,String ugSubjectSpecialization) {
		setName(name);
		setSalary(salary);
		setDepartment(department);
		setUgSubjectSpecialization(ugSubjectSpecialization);
		
	}
	
	@Override
	public void displayDetails() {
		System.out.println("------------------------------------------------------");
		System.out.println("Name:"+this.getName());
		System.out.println("Department:"+this.getDepartment());
		System.out.println("Salary:"+this.getSalary());
		System.out.println("Specialization:"+this.getUgSubjectSpecialization());
	}
}
