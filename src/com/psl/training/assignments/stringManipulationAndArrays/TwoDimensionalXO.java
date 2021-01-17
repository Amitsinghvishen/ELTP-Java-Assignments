package com.psl.training.assignments.stringManipulationAndArrays;

import java.util.Scanner;

public class TwoDimensionalXO {

	public static void main(String[] args) {
		char [][] arr={{'x','o','o'},{'x','o','x'},{'x','o','o'}};
		int xCount=0,oCount=0;
		
		
		//for horizontal
		for(int i=0;i<arr.length;i++) {
			xCount=0;
			oCount=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]=='x')
					xCount++;
				else
					oCount++;
				
			}
			if(xCount==arr.length)
				System.out.println("X horizontally");
			if(oCount==arr.length) {
				System.out.println("O horizontally");
			}
		}
		
		//for vertical
		for(int i=0;i<arr.length;i++) {
			xCount=0;
			oCount=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j][i]=='x')
					xCount++;
				else
					oCount++;
			}
			if(xCount==arr.length)
				System.out.println("X vertically");
			if(oCount==arr.length) 
				System.out.println("O vertically");
		}
		
		//for diagonally
		xCount=0;
		oCount=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j)
				{
					if(arr[i][j]=='x')
						xCount++;
					
					
					if(arr[i][j]=='o')
						oCount++;
					
				}
			}
			
		}
		if(xCount==arr.length)
			System.out.println("X vertically");
		if(oCount==arr.length) 
			System.out.println("O vertically");

	}

	
}
	

