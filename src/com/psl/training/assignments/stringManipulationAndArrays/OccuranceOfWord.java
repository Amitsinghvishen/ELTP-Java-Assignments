package com.psl.training.assignments.stringManipulationAndArrays;

import java.util.Scanner;

public class OccuranceOfWord {
	static int check(String sentence,String word) {
		int count=0;
		sentence=sentence.toLowerCase();
		word=word.toLowerCase();
		String words[]=sentence.split(" ");
		for(String s:words) {
			if(s.equals(word))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence=s.nextLine();
		System.out.println("Enter a word:");
		String word=s.next();
		System.out.println("Number of occurance is:"+check(sentence,word));
		
	}

}
