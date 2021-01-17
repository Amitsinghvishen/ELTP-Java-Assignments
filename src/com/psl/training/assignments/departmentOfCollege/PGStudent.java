package com.psl.training.assignments.departmentOfCollege;

public class PGStudent extends Student{
	private String pgCourse;

	public String getpgCourse() {
		return pgCourse;
	}

	public void setpgCourse(String pgCourse) {
		this.pgCourse = pgCourse;
	}
	public PGStudent(String name,int rollno,int fees,String pgCourse) {
		setName(name);
		setRollno(rollno);
		setFees(fees);
		setpgCourse(pgCourse);
	}
	@Override
	public void displayDetails() {

		System.out.println("------------------------------------------------------");
		System.out.println("Name:"+this.getName());
		System.out.println("Rollno:"+this.getRollno());
		System.out.println("Course:"+this.getpgCourse());
		System.out.println("Fees:"+this.getFees());
	}
}
