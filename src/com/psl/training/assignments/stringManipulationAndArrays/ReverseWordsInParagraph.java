package com.psl.training.assignments.stringManipulationAndArrays;

import java.util.Scanner;

public class ReverseWordsInParagraph {
	static String  makeReverse(String str) {
	String words[]=str.split(" ");
	String result=new String();
	for(String s:words) {
		result+= new StringBuffer(s).reverse().toString();
		result+=" ";
	}
	  return result;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Paragraph:");
		String str=s.nextLine();
		System.out.println("Reversed Paragraph is: "+makeReverse(str));
	}

}
