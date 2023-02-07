package com.jdc.mkt;

import java.util.Iterator;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer>list = List.of(3,4,5,647,47,567,4673);
		
		//before stream
		var total = sum(list);
		System.out.println(total);
		
		//after
		 var total2  = list.stream().mapToInt(i->i).sum();
		 System.out.println(total2);
		
	}
	
	static int sum(List<Integer> list) {
		
		Iterator<Integer>itr = list.iterator();
		var res = 0;
		
		while(itr.hasNext()) {
			res += itr.next();
		}
		
		return res;
		
	}
}
