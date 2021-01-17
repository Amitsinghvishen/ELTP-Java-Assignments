package com.psl.training.assignments.stringManipulationAndArrays;

public class AvailabilityOfGivenNumber {
	static int findPosition(int num,int[] nos) {
		int position=0;
		for(int i=0;i<nos.length;i++) {
			if(nos[i]==num) {
				position=i+1;
				break;
			}
		}
		return position;
	}
	public static void main(String[] args) {
		int nos[]= {1,2,3,4,5,6,7,8,9};
		int num=5;
		System.out.println("Position of the number is:"+findPosition(num,nos));
	}

}
