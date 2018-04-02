package com.haibowen;

import java.io.*;

public class Food {
	public static void main (String [] args){
		food1 f=new food1();
		f.start();
		takefood tf=new takefood();
		tf.start();
		
	}

}
class food1 extends Thread{
	public void run(){
		String name="D:/huowu.txt";
		try {
			FileWriter writer=new FileWriter(name);
			writer.write("еёдл");
			writer.write("       ");
			writer.write("5");
			writer.write("       ");
			writer.write("длюр");
			writer.write("       ");
			writer.write("10");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class takefood extends Thread{
	public void run(){
		String name ="D:/huowu.txt";
		try {
			BufferedReader reader= new BufferedReader(new FileReader(name));
			String line ;
			line=reader.readLine();
			while(line !=null){
				System.out.print(line);
				line=reader.readLine();
				
			}
			reader.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	}
