package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OneFileTest {

	private static File file;
	
	@BeforeAll
	static void createPathFile() {
		file = new File("file.txt");
	}
	
	@Test
	void testFile() throws IOException {
		file.createNewFile();
		
		System.out.println("abs :"+file.getAbsolutePath());
		System.out.println("name :"+file.getName());
		System.out.println("parent :"+file.getParent());
		System.out.println("parent file :"+file.getParentFile());
		
		assertTrue(file.exists());
		
	}
	
	
	
}


