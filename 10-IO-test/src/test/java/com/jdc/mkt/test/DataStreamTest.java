package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.DataStreamDemo;
import com.jdc.mkt.MyData;

public class DataStreamTest {

	private static DataStreamDemo demo;
	private static MyData data;
	
	@BeforeAll
	static void createDataStreamObj() {
		demo = new DataStreamDemo(new File("data_test.dat"));
		data = new MyData();
		data.setNumInt(12);
		data.setNumFloat(23.23f);
		data.setNumbool(true);
		data.setDesc("test data");
	}
	
	@Test
	void testData() {
		//demo.writeData(data);
		assertEquals(data.getNumInt(),
				demo.readData().getNumInt());
	}
}
