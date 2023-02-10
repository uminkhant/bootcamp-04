package com.jdc.mkt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamDemo {

	private File file;
	
	public DataStreamDemo(File file) {
		this.file = file;
	}
	
	public void writeData(MyData d) {
		try(DataOutputStream dout = 
				new DataOutputStream(new FileOutputStream(file)) ){
			dout.writeInt(d.getNumInt());
			dout.writeBoolean(d.isNumbool());
			dout.writeFloat(d.getNumFloat());
			dout.writeUTF(d.getDesc());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public MyData readData() {
		try(DataInputStream dIn = 
				new DataInputStream(new FileInputStream(file))){ 			
			MyData data = new MyData();
			data.setNumInt(dIn.readInt());
			data.setNumbool(dIn.readBoolean());
			data.setNumFloat(dIn.readFloat());
			data.setDesc(dIn.readUTF());
			return data;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
