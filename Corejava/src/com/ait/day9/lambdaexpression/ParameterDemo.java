package com.ait.day9.lambdaexpression;

public class ParameterDemo {
	public static void main(String[] args) {
		Cube c=(a)->{
			return a*a*a;			
		};
		System.out.println("Cube of the number:"+c.calculate(29));
	}
}
