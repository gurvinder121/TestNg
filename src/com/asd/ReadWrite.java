package com.asd;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

	public static void main(String args[]) throws IOException
	{
		
	BufferedInputStream bis=null;
	BufferedOutputStream bos=null;
	bis=new BufferedInputStream(new FileInputStream("./asd1/read.txt"));
	bos=new BufferedOutputStream(new FileOutputStream("./asd1/write.txt"));
	int data;
	//int data1=bis.read();
	while((data=bis.read())!=-1)
	{
		
		//System.out.println(bis.read());
		bos.write(data);
	}
		
		
		bis.close();
		bos.close();
		
		
		
	}
}
