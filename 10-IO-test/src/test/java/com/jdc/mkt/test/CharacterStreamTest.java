package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.CharacterStreamDemo;

public class CharacterStreamTest {

	
	//private static  File file;
	private static CharacterStreamDemo demo;
	
	@BeforeAll
	static void createFile() {
		//file = new File("character_test.txt");
		demo = new CharacterStreamDemo( new File("character_test.txt"));
	}
	
	@Test
	void testCharacter() {
		demo.writeCharacter();
		assertNotEquals(-1,demo.readCharacter());
	}
	
}
