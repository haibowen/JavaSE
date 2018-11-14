package com.haibowen.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class TestCopy {
	
	
	public static void main(String[] args) {
		String str;
		
		File file=new File("E:"+File.separator+"haibo.txt");
		File file1=new File("E:"+File.separator+"haibo1.txt");
		
		if(file.exists()) {
			file.delete();
			
		}else {
			try {
				file.createNewFile();
				InputStream inp=System.in;
				byte[] result=new byte[1024];
				while(inp.read()!=-1) {
					 str=new String(result).trim();
					 System.out.println(str);
				}
				
				inp.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
	}

}
