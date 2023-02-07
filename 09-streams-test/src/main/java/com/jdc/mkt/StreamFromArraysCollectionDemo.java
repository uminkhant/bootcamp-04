package com.jdc.mkt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFromArraysCollectionDemo {

	public static void main(String[] args) {
		
		
		//from array or collection
	/*	String[]names = {"ko ko","Mg Mg","Mu Mu"};		
		Consumer<String> con = a -> System.out.println(a);		
		Arrays.stream(names).forEach(a->con.accept(a));
	
		List<Integer>list =List.of(2,3,4,5);
		list.stream().forEach(a->System.out.println(a));*/
	
		//range data
		IntStream.range(1,10).forEach(i -> System.out.print(i));
		System.out.println();
		int sum = IntStream.rangeClosed(1,10).map(i -> i).sum();
		System.out.println(sum);
		
		//math generate
		DoubleSupplier ds = Math::random;		
		DoubleStream
		.generate(ds)
		.limit(10)
		.forEach(d -> System.out.println(d));
		
		//iterate
//		IntUnaryOperator io = a ->a+1;
//		IntStream.iterate(1,io).limit(3).forEach(a->System.out.println(a));
		
		//filter
		IntPredicate ip = a -> a%2 == 0;
		int[] arr =	IntStream.rangeClosed(1, 10).filter(ip).toArray();
		Arrays.stream(arr).forEach(a->System.out.println(a));
		
		//map
	int[] arr1 = List.of("4","6","7","9","11","12","14")
		.stream()
		.mapToInt(a->Integer.parseInt(a))
		.filter(i -> (i%2)!=0)
		.toArray();
	Arrays.stream(arr1).forEach(s -> System.out.println(s));
	
	Stream.of(List.of(1,2),List.of(5,6))
	.flatMap(s->s.stream()).forEach(e -> System.out.println(e));
	
	
	}
}
