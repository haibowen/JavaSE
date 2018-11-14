package com.haibowen.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

public class TestInput {
	
	
	public static void main(String[] args) {
		
		String s;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("windows ֹͣ ctrl+Z"+"   "+"uinx ֹͣ ctrl+c");
		try {
			s=br.readLine();	
			while(s!=null) {
				
				System.out.println("Read:"+s);
				s=br.readLine();
				
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
