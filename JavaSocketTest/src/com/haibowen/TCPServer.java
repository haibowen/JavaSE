package com.haibowen;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
public class TCPServer {
	public static void main (String []args) throws IOException {
		ServerSocket sc=new ServerSocket(22222);
		System.out.println("正在监听。.....");
		Socket s=sc.accept();
		System.out.println("已连接！");
		
		
		DataInputStream dis =new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());
		s.close();
		dis.close();
	
		
		
	}

}
