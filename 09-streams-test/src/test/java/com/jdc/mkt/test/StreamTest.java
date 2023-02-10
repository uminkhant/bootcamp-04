package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.Data;

class StreamTest {

	static List<Integer> list;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	//	int[] arr = IntStream.rangeClosed(0, 10).toArray();
		
		list = List.of(1,5,3,2,7,9,1,0,2);
		
		System.out.println("Before all");
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
	}

	@Test
	void test() {
		Data d =Data.HUMAN;
		d.show();
		long l = list.stream().distinct().count();
		assertEquals(7, l);
	}
	@Test
	void show() {
		System.out.println("hello");
	}

}
