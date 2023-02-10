package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.ByteStreamDemo;

public class ByteStreamTest {
	
	private static ByteStreamDemo demo;
	
	@BeforeAll
	static void createFile() {
		demo = new ByteStreamDemo();
	}
	
	@Test
	void TestData() throws IOException {
		demo.writeByteData();
		assertNotNull(demo.readByteData());
		
	}
	
	
}
