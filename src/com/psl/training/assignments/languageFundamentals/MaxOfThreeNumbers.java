package com.psl.training.assignments.languageFundamentals;

public class MaxOfThreeNumbers {
    static int calMax(int x,int y,int z) {
    	int max=0;
    	if(x>max) {
    		max=x;
    	}
    	if(y>max) {
    		max=y;
    	}
    	if(z>max) {
    		max=z;
    	}
    	return max;
    }
	public static void main(String[] args) {
		int x=5,y=6,z=10;
		System.out.println(calMax(x,y,z));
	}

}
