package com.haibowen;

import java.io.BufferedReader;
import java.io.*;

public class BufferedReaderTester {
	public static void main (String []arges) {
		String fileName="F:/newHello.txt";
		String line;
		try {
			BufferedReader in =new BufferedReader(new FileReader(fileName));
			line =in.readLine();
			while (line!=null) {
				System.out.println(line);
				line =in.readLine();
				
			}
			in.close();
			
			
		}
		catch(IOException iox) {
			System.out.println("Problem reading "+fileName);
			
		}
		
	}

}
