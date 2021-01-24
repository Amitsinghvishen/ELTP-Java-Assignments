package com.psl.training.assignments.ExceptionHandlingAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptionHandling {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("C:\\Users\\Amit\\eclipse-workspace\\ELTP Java Assignments\\src\\com\\psl\\training\\assignments\\ExceptionHandlingAssignment\\Movies.txt");
		Scanner s=new Scanner(file);
		while(s.hasNext()) {
			String line=s.nextLine();
			String[] splitText=line.split("-");
			if(splitText.length<2) {
				try {
				throw new Exception("Check for number of fields provided");
				}
				catch(Exception e) {
						e.printStackTrace();
				}
				
			}
			else {
				try {
					System.out.println(Integer.parseInt(splitText[1]));
				}
				catch(Exception e) {
			    	System.out.println("Check for valid movie ids. Must be Integers "+ e);
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
			
		}
	}
}
