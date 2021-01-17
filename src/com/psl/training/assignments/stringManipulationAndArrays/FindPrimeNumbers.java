package com.psl.training.assignments.stringManipulationAndArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPrimeNumbers {
	static Integer[] findPrime(int from,int to) {
		boolean prime[]=new boolean[to+1];
		for(int i=0;i<to;i++) {
			prime[i]=true;
		}
		
		for(int i=2;i*i<to;i++) {
			if(prime[i]==true)
			for(int j=i*i;j<to;j+=i) {
				prime[j]=false;
			}
		}
		ArrayList<Integer> a=new ArrayList<Integer>();

		for(int i=from;i<=to;i++) {
			if(prime[i]==true) {
				a.add(i);
			}
		}
		Integer primes[]=a.toArray(new Integer[0]);
		return primes;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int from,to;
		System.out.println("Enter the 'from' number:");
		from=s.nextInt();
		System.out.println("Enter the 'from' number:");
		to=s.nextInt();
		Integer i[]=findPrime(from,to);
		System.out.println("Prime numbers are:" );
		for(int j=0;j<i.length;j++) {
		System.out.println("\n"+i[j]);
		}
	}

}
