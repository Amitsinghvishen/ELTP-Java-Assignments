package com.psl.training.assignments.stringManipulationAndArrays;

import java.util.Scanner;

public class ReplaceString {
	static String findAndReplace(String str,String replace,String replacement) {
		String result;
		result=str.replace(replace, replacement);
		return result;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=s.nextLine();
		System.out.println("Enter a string that need to be replaced:");
		String replace=s.nextLine();
		System.out.println("Enter string that will replace:");
		String replacement=s.nextLine();
		System.out.println("String after replacement is:"+findAndReplace(str,replace,replacement));
	}

}
