package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.ByteStringDemo;

public class ByteStreamTest {
	
	private static ByteStringDemo demo;
	
	@BeforeAll
	static void createFile() {
		demo = new ByteStringDemo();
	}
	
	@Test
	void TestData() throws IOException {
		demo.writeByteData();
		assertNotNull(demo.readByteData());
		
	}
	
	
}
