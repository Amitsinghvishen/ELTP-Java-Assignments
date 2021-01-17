package com.psl.training.assignments.medicine;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine m[]=new Medicine[10];
		Random rand=new Random();
		for(int i=0;i<m.length;i++) {
			int r=rand.nextInt(3)+1;
			switch(r) {
			case 1: m[i]=new Tablet("Tablet Place","A Pharma","Cool and Dry");
					break;
			case 2:m[i]=new Syrup("Syrup Place","B Pharma","Orange");
					break;
			case 3:m[i]=new Ointment("Ointment Place","C Pharma","Complex");
					break;
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			
			System.out.println("---------------------------------------");
			m[i].displayLabel();
			
		}
	}

}
