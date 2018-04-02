package com.haibowen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class shujudanyuan {
	public static void main (String args []){
		
		shujuThread a=new shujuThread("a");
		a.start();
		shujuThread1 b= new shujuThread1();
		b.start();
		
		
		
		
	}

}
class shujuThread extends Thread{
	
	public shujuThread(String name){
		super(name);	
	}
	public void run(){
		String fileName="D:/shuju.txt";
		
			try {
				FileWriter writer =new FileWriter(fileName);
				writer.write("ÍõÇ¿");
				writer.write("    ");
				writer.write("201542888");
				writer.write("       ");
				writer.write("ÎÂº£²¨");
				writer.write("    ");
				writer.write("201542596");		
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
class shujuThread1 extends Thread{
	  
	
	public void run(){
		String fileName="D:/shuju.txt";
		
		String line ;
		try {
			BufferedReader in =new BufferedReader(new FileReader(fileName));
			line =in.readLine();
			while(line !=null)
			{
				System.out.println(line);
				line =in.readLine();	
				
			}	
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
