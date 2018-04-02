package com.haibowen;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTester {
	public static void main (String [] arges)throws IOException {
		String fileName="F:\\Hello.txt";
		FileWriter writer =new FileWriter (fileName);
		writer.write("Hello!\t");
		writer.write("This is my first text file,\n");
		writer.write("You can see how this is done.\n");
		writer.write("输入一行中文文字也可以\n");
		writer.close();
	}

}
