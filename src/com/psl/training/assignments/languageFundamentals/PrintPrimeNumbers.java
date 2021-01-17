package com.psl.training.assignments.languageFundamentals;
import java.util.Scanner;
public class PrintPrimeNumbers {
	static void printPrime(int maxVal) {
		boolean prime[]=new boolean[maxVal+1];
		for(int i=0;i<maxVal;i++) {
			prime[i]=true;
		}
		for(int i=2;i*i<maxVal;i++) {
			if(prime[i]==true)
			for(int j=i*i;j<maxVal;j=j+i) {
				prime[j]=false;
			}
		}
		
        for(int i = 2; i <=maxVal; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
	}
	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	printPrime(num);
	}
}
