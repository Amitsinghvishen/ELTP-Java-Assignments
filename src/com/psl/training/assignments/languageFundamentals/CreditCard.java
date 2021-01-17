package com.psl.training.assignments.languageFundamentals;
import java.util.Scanner;
public class CreditCard {
	static float payBack(int charges) {
		float payBackOnCharges=0;
		if(charges<=500) {
			payBackOnCharges=(float)(charges*0.0025);
		}
		else {
			charges-=500;
			payBackOnCharges+=(float)(500*0.0025);
			if(charges<=1000) {
				payBackOnCharges+=(float)(charges*0.0050);
			}
			else {
				charges-=1000;
				payBackOnCharges+=(float)(1000*0.0050);
				if(charges<=1000) {
					payBackOnCharges+=(float)(charges*0.0075);
				}
				else {
					charges-=1000;
					payBackOnCharges+=(float)(1000*0.0075);
					if(charges>0) {
						payBackOnCharges+=(float)(1000*0.01);
					}
				}
			}
		}
		return payBackOnCharges;
		
	}
	public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter charges:");
		int charges=s.nextInt();
		System.out.println("Pay back is:"+payBack(charges));
	}

}
