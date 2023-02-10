package com.jdc.mkt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStringDemo {

	private File file;
	byte[] bDatas = "Hello".getBytes();
	
	
	public void createFile() throws IOException {
		 file = new File("byte_test.txt");
		 
		 if(!file.exists()) {
			 file.createNewFile();
		 }
	}

	public void writeByteData() throws IOException  {
		
		createFile();
		
		try( FileOutputStream fout = new FileOutputStream(file)) {
				
			fout.write(bDatas);		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public byte[] readByteData() {
		try(FileInputStream fIn = new FileInputStream(file)){
			
			int i = 0;
			
			while((i = fIn.read()) != -1) {
				System.out.println(i);
				
			}
			return fIn.readAllBytes();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
