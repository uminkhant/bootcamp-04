package com.jdc.mkt;

import java.util.function.Function;

public class OtherFunctionTest {

	public static void main(String[] args) {
		
		Function<String, String> f1 = s -> "'" + s + "'";
		
		Function<Integer, String> f2 = f1.compose(Integer::toOctalString);
		System.out.println(f2.apply(72));
		
		Function<Integer, String> f3 = ((Function<Integer, String>) Integer::toOctalString).andThen(f1);
		System.out.println(f3.apply(75));
	}
}
