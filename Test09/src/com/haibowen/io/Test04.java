package com.haibowen.io;

public class Test04 {
	public static void main(String[] args) {
		
		int b;
		try {
			System.out.println("start");
			
			/**
			while((b=System.in.read())!=-1) {
				System.out.print((char)b);
				
			}
			**/
			if((b=System.in.read())!=-1) {
				
				System.out.println((char)b);
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
	}

}
