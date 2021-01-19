package com.psl.training.service;
import com.psl.training.util.Calculator;
public class CalculatorService {
	public int performCalculation(Operations op,int n1,int n2) {
		Calculator c=new Calculator();
		int result=0;
		switch(op) {
		case ADD:	result=c.add(n1,n2);
					break;
		case SUB:	result=c.sub(n1,n2);
					break;
		case DIVIDE: result=c.div(n1, n2);
					break;
		case MULTIPLY: result=c.mult(n1, n2);
		}
		
		return result;
	}
}
