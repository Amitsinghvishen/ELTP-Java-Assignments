package com.psl.training.assignments.assignments1;

public class HelloPattern {

	public static void main(String[] args) {
		String str="Hello";
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.println(" ");
			for(int j=0;j<=i;j++) {
				System.out.print(c[j]+" ");
			}
		}

	}

}
