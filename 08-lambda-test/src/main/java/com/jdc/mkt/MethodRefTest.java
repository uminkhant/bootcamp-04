package com.jdc.mkt;

public class MethodRefTest {

	public static void main(String[] args) {
		
		//lambda
		
		Human human1 = (a,b)-> "%s is %d yrs old".formatted(b,a);
		String res = human1.show(23, "Wanna");
		System.out.println(res);
		
		
		//method reference
		
		Human human2 = MethodRefTest::showHuman;
		String res2 = human2.show(44, "Aye ko");
		System.out.println(res2);
	}
	
	static String showHuman(int age ,String name) {
		
		return "%s is age of %d".formatted(name,age);
	}
}
