package com.psl.training.assignments.departmentOfCollege;

public class TestCollege {

	public static void main(String[] args) {
		IPerson p1=new UGStudent("Amit",3,60000,"B.E.");
		p1.displayDetails();
		IPerson p2=new PGStudent("Sagar",13,50000,"M.E.");
		p2.displayDetails();
		IPerson p3=new UGFaculty("S.N.Ram",65000,"CSE","OS");
		p3.displayDetails();
	}

}
