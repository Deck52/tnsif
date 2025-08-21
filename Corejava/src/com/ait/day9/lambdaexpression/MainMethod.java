package com.ait.day9.lambdaexpression;

public class MainMethod {

	public static void main(String[] args) {		
			Message m=()->{
				return "Welcome";			
			};
			System.out.println(m.greet());
		}
}
