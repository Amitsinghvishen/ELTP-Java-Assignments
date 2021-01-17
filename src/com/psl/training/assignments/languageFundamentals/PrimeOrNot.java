package com.psl.training.assignments.languageFundamentals;

import java.util.Scanner;

public class PrimeOrNot {
	static boolean isPrimeNumber(int num) {
		boolean flag=true;
		if(num==0||num==1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
			}
				
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(isPrimeNumber(n)) {
		System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
		s.close();
	}

}
