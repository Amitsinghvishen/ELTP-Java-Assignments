package com.psl.training.assignments.languageFundamentals;
import java.util.Scanner;
public class TaxCalculation {
	static double calTax(int gp) {
		double tax;
		if(gp<=240) {
			tax=0;
		}
		else if(gp<480) {
			tax=gp*0.15;
		}
		else {
			tax=gp*0.28;
		}
		return tax;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int gp=s.nextInt();
		System.out.println("Tax amount is:"+calTax(gp));
		s.close();
	}

}
