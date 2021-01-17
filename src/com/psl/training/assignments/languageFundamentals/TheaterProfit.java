package com.psl.training.assignments.languageFundamentals;
import java.util.Scanner;
public class TheaterProfit {
	static float calculateProfit(int numAttendees) {
		float profit;
		profit=(float)((numAttendees*5)-(20+numAttendees*0.5));
		return profit;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int numAttendees=s.nextInt();
		System.out.println("Profit is:"+calculateProfit(numAttendees));
	
	}

}
