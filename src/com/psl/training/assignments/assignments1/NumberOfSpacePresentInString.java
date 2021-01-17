package com.psl.training.assignments.assignments1;

import java.util.Scanner;

public class NumberOfSpacePresentInString {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string:");
			String str=sc.nextLine();
			char c[]=str.toCharArray();
			int count=0;
			for(int i=0;i<str.length();i++)
				if(c[i]==' ')
					count++;
			System.out.println("Number of spaces present in string are:"+count);
		}

	}


