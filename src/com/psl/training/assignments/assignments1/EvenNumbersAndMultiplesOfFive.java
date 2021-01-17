package com.psl.training.assignments.assignments1;

import java.util.Scanner;

public class EvenNumbersAndMultiplesOfFive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		System.out.println("Enter elements in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%2==0&&arr[i]%5==0)
				count++;
		}
		System.out.println("Number of even numbers and multiples of 5 present in array:"+count);
		

	}
}
