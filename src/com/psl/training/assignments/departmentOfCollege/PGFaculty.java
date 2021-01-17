package com.psl.training.assignments.departmentOfCollege;

public class PGFaculty extends Faculty {
	private String pgSubjectSpecialization;

	public String getPgSubjectSpecialization() {
		return pgSubjectSpecialization;
	}

	public void setPgSubjectSpecialization(String pgSubjectSpecialization) {
		this.pgSubjectSpecialization = pgSubjectSpecialization;
	}
	public PGFaculty(String name,int salary,String department,String pgSubjectSpecialization) {
		setName(name);
		setSalary(salary);
		setDepartment(department);
		setPgSubjectSpecialization(pgSubjectSpecialization);
		
	}
	@Override
	public void displayDetails() {
		System.out.println("------------------------------------------------------");
		System.out.println("Name:"+this.getName());
		System.out.println("Department:"+this.getDepartment());
		System.out.println("Salary:"+this.getSalary());
		System.out.println("Specialization:"+this.getPgSubjectSpecialization());
	}
}
