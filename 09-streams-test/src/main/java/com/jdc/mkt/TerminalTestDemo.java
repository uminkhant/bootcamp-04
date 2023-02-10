package com.jdc.mkt;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalTestDemo {

	public static void main(String[] args) {

		int[] op = List.of("2", "3", "4", "7", "3").stream().mapToInt(s -> Integer.parseInt(s))

				.toArray();
		// .count();
		// .max();
		// .min();
		// .findFirst();
		// .findAny();
		// .forEachOrdered(System.out::println);

		//System.out.println(op);

		String str = "ss";

//	String res =	List.of("aa", "bb", "dd", "ff", "aa")
//		.stream()
//		.filter(a -> a.equals(str))
//		.findAny()
//		.orElse("Hello");
//	
//	System.out.println(res);
	
		
	int res = IntStream.of(4,5,6,7).reduce((a,b)->a+b).getAsInt();
	System.out.println(res);
	
	
	int res1 = IntStream.rangeClosed(1, 10)
			.reduce(TerminalTestDemo::sum)
			.getAsInt();
			
		System.out.println(res1);	
	

		 List.of("4","44","6","2","8","2","2","10")
		.stream()
		.map(a -> Integer.parseInt(a))
		.map(s -> s+",")
		.distinct()
		.collect(Collectors.toList()).forEach(System.out::print);
		
	}
	
	static int sum(int a, int b) {
		return a+b;
	}
}
