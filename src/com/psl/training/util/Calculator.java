package com.psl.training.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Calculator {
	
	static Logger logger=Logger.getLogger(Calculator.class.getName());
	static {
		try {
			logger.addHandler(new FileHandler("calc.log",true));
		}
		catch(SecurityException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public int add(int x,int y) {
		return x+y;
	}
	public int mult(int x,int y) {
		return x*y;
	}
	public int div(int x,int y) {
		int res=0;
		try {
		res= x/y;
		}
		catch(Exception e) {
			logger.info("Divide by zero Exception!!!");
			
		}
		return res;
	}
	public int sub(int x,int y) {
		return x-y;
	}
}
