package com.psl.training.assignments.assignments1;

import java.util.Scanner;

public class VowelsPresentInTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
			if(c[i]=='a'||c[i]=='A'||c[i]=='e'||c[i]=='E'||c[i]=='i'||c[i]=='I'||c[i]=='o'||c[i]=='O'||c[i]=='u'||c[i]=='U')
				count++;
		System.out.println("Number of vowels present in string are:"+count);
	}

}
