package com.jdc.mkt;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamDemo {

	private File file;
	private String text =  "This is test";
	
	public CharacterStreamDemo(File file) {
		this.file = file;
	}
		
	public void writeCharacter() {
		
		try(FileWriter fw = new FileWriter(file)){
			
			fw.write(text);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int readCharacter() {
		try(FileReader fr = new FileReader(file)){
		
			int i = -1;
			
			while((i = fr.read()) != -1) {
				System.out.println(i);
				return i;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	
}
