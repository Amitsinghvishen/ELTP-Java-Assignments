package com.psl.training.assignments.languageFundamentals;

import java.util.Scanner;

public class BankInterest {
	static double callInterest(int amt) {
		double interest=0;
		if(amt<=1000) {
			interest=amt*0.04;
		}
		else if(amt>1000 && amt<=5000) {
			interest=amt*0.045;
		}
		else {
			interest=amt*0.05;
		}
		return interest;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the deposit amount:");
		int amt=s.nextInt();
		System.out.println("Interest is:" + callInterest(amt));
		s.close();
	}

}
