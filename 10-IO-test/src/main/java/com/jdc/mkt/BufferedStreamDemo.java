package com.jdc.mkt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class BufferedStreamDemo {

	private File file;

	public BufferedStreamDemo(File file) {
		this.file = file;
	}

	public void writeData() {
		try(PrintWriter pw = new PrintWriter(file)){
			
			pw.write("""
					java is a multi-platform, object-oriented,
					and network-centric language that can be used
					as a platform in itself. It is a fast, secure, 
					reliable programming language for coding everything from mobile apps and
					enterprise software to big data applications 
					and server-side technologies.
					
					""");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String readData() {
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String str = "";
			
			StringBuffer sb = new StringBuffer();
			
			while((str = br.readLine())!= null) {
				//System.out.println(str);
				 sb.append(str);
			}
			
			return sb.toString();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
