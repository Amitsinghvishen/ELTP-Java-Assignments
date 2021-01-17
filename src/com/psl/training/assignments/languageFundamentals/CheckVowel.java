package com.psl.training.assignments.languageFundamentals;


import java.util.Scanner;

public class CheckVowel {
	
	static boolean checkAlpha(char c) {
		boolean flag=false;
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
			flag=true;
		}
		return flag;
	}

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a Character:");
			char c=s.nextLine().charAt(0);
			if(checkAlpha(c)) {
				System.out.println("It is a vowel");
			}
			else {
				System.out.println("It is not a vowel");
			}
			s.close();
	}

}
