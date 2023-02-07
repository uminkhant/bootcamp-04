package com.jdc.mkt;

public class MethodRefTestTwo {

	
	public MethodRefTestTwo(int a) {
		System.out.println("Using Constructor ref "+a);
	}
	
	public void instanceMethodTest(int a) {
		System.out.println("Using instance method ref "+a);
	}
	
	public static void staticMethodTest(int a) {
		System.out.println("Using static method ref "+a);
	}
}
