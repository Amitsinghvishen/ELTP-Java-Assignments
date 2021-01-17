package com.psl.training.assignments.assignments1;

import java.util.Scanner;

public class TotalCharactersPresentInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Number of characters present in the string are:"+str.length());
	}

}
