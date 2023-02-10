package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.BufferedStringDemo;

public class BufferedStringTest {

	private static BufferedStringDemo demo;
	
	@BeforeAll
	static void createFile() {
		demo = new BufferedStringDemo(new File("buffer_test.txt"));
	}
	
	@Test
	void bufferedTest() {
		demo.writeData();
		System.out.println(demo.readData());
		assertNotNull(demo.readData());
	}
}
