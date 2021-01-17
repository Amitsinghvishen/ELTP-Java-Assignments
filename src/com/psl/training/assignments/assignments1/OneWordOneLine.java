package com.psl.training.assignments.assignments1;

import java.util.Scanner;

public class OneWordOneLine {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=s.nextLine();
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

}
