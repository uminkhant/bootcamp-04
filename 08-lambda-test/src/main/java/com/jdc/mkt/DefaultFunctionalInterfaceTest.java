package com.jdc.mkt;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class DefaultFunctionalInterfaceTest {

	public static void main(String[] args) {
		
		Consumer<String> c1 = a->System.out.println(a);
		c1.accept("Hello");
		
		c1 = DefaultFunctionalInterfaceTest::showName;
		c1.accept("sandar");
		
		
		Function<String, Integer> f1 = str -> Integer.parseInt(str);
		int res =f1.apply("45");
		System.out.println(res+2);
		
		
		Predicate<Integer> p1 = a -> a > 0 && a <=10 ;
		boolean b = p1.test(10);
		System.out.println(b);
		
		
		ToIntFunction<String> f2 = i -> Integer.parseInt(i);
		int res2 = f2.applyAsInt("44");
		System.out.println(res2);
		
		BiPredicate<Integer, Integer> p2 = (a,c) ->(a%c)==0;
		boolean res3 = p2.test(10, 2);
		System.out.println(res3);
		
		Function<String, Integer> fun = f->Integer.parseInt(f);
		fun.apply("56");
		
		BiFunction<Integer, Integer, String> bf = (a,d) ->String.valueOf(a+d);
		//bf.andThen(fun);
		int res5 = bf.andThen(fun).apply(3, 4);
		System.out.println(res5);
		
	}
	
	static void showName(String str) {
		System.out.println(str);
	}
}
