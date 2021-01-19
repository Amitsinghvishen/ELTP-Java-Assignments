package com.psl.training.tester;

import com.psl.training.service.CalculatorService;
import com.psl.training.service.Operations;

public class TestCalculator {

	public static void main(String[] args) {
		CalculatorService cs=new CalculatorService();
		System.out.println("Add:"+cs.performCalculation(Operations.ADD, 12, 13));
		System.out.println("Subtract:"+cs.performCalculation(Operations.SUB, 12, 13));
		System.out.println("Multiply:"+cs.performCalculation(Operations.MULTIPLY, 12, 13));
		System.out.println("Divide:"+cs.performCalculation(Operations.DIVIDE, 12, 0));
		System.out.println("-----------End--------------");
	}

}
