package com.psl.training.assignments.languageFundamentals;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter 1 for domestic connection or Enter 0 for commercial connection:");
		b=s.nextInt();
		System.out.println("Enter units:");
		a=s.nextInt();
		System.out.println("Bill in Rs : "+calBill(a,b));
	}

	
	public static double calBill(int a,int b)
	{
		if(b==1)
		{
			if(a<=100)
			{
				double bill= (a*4);
				if(bill<=250)
				{
					return 250;
				}
				else
				{
					return bill;
				}
			}
			else if(a>100 && a<=300)
			{
				return (a*4.5);
			}
			else if(a>300 && a<=500)
			{
				return (a*4.75);
			}
			else
			{
				return (a*5);
			}
		}
		else
		{
			if(a<=100)
			{
				double bill= (a*4.25);
				if(bill<=350)
				{
					return 350;
				}
				else
				{
					return bill;
				}
			}
			else if(a>100 && a<=300)
			{
				return (a*4.75);
			}
			else if(a>300 && a<=500)
			{
				return (a*5);
			}
			else
			{
				return (a*5.25);
			}
		}
		
		
	}

	}




