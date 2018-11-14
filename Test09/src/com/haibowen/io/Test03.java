package com.haibowen.io;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		
		
		File file=new File("E:"+File.separator+"MP1");
		if(file.exists()&&file.getParentFile().exists()) {
			
		File []list=file.listFiles();
		
		for(int i=0;i<list.length;i++) {
			
			System.out.println(list[i]);
		}
		
		}
		
	
	}

}
