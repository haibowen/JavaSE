package com.haibowen.io;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

public class Test02 {
	
	public static void main(String[] args) {
		
		
		File   file =new File("E:"+File.separator+"123456"+File.separator+"haibowen.txt");
		File file1=new File("E:"+File.separator+"text.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
			
		
		}
		if(file.exists()||file1.exists()) {
			
			System.out.println("have");
			System.out.println(new BigDecimal(file.length()/(double)1024/1024).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP)+"M");
			file.delete();
			file1.delete();
			
		}else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}

}
