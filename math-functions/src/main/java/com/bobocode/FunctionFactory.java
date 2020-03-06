package com.bobocode;



public class FunctionFactory {
	
	static Integer getAbs(int a) {
		return Math.abs(a);
	}
	
	static Integer getSignum(int a) {
		return Math.round(Math.signum(a));
	}
	
	static Integer increment(int a) {
		return a+1;
	}
	
	static Integer decrement(int a) {
		return a-1;
	}
	
	static Integer square(int a) {
		return (int)Math.pow(a, 2);
	}

}
