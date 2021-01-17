package com.psl.training.assignments.departmentOfCollege;

public class UGStudent extends Student{
	private String ugCourse;

	public String getUgCourse() {
		return ugCourse;
	}

	public void setUgCourse(String ugCourse) {
		this.ugCourse = ugCourse;
	}
	
	public UGStudent(String name,int rollno,int fees,String ugCourse) {
		setName(name);
		setRollno(rollno);
		setFees(fees);
		setUgCourse(ugCourse);
	}
	
	@Override
	public void displayDetails() {

		System.out.println("------------------------------------------------------");
		System.out.println("Name:"+this.getName());
		System.out.println("Rollno:"+this.getRollno());
		System.out.println("Course:"+this.getUgCourse());
		System.out.println("Fees:"+this.getFees());
	}
}
