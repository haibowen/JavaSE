package com.haibowen;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
public class TCPServer {
	public static void main (String []args) throws IOException {
		ServerSocket sc=new ServerSocket(22222);
		System.out.println("���ڼ�����.....");
		Socket s=sc.accept();
		System.out.println("�����ӣ�");
		
		
		DataInputStream dis =new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());
		s.close();
		dis.close();
	
		
		
	}

}
