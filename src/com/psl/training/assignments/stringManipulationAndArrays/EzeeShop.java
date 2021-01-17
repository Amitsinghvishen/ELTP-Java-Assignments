package com.psl.training.assignments.stringManipulationAndArrays;
import java.util.Scanner;
public class EzeeShop {
	static Scanner s=new Scanner(System.in);	
	static String[] initProductNames() {

		System.out.println("Enter number of products:");
		int num=s.nextInt();
		System.out.println("Enter Products:");
		String product[]=new String[num+1];
		for(int i=0;i<=num;i++) {
			product[i]=s.nextLine();
		}
		return product;
	}
	static boolean isPresent(String[] productNames, String keyword) {
		boolean flag=false;
		for(int i=0;i<productNames.length;i++) {
			if(productNames[i].contains(keyword)) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		String[] products=initProductNames();
		System.out.println("Enter a keyword:");
		String keyword=s.nextLine();
		if(isPresent(products,keyword)) {
			System.out.println("Products is Present");
		}
		else {
			System.out.println("Product is not present");
		}
	}

}
