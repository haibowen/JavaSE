package com.haibowen.io;

import java.io.File;
import java.io.IOException;

public class Test01 {
	
	public static void main(String[] args) {
		
		
		File file=new File("E:"+File.separator+"text.txt");
		if(file.exists()) {
			
			file.delete();
			
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
