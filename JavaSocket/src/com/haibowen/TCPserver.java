package com.haibowen;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
public class TCPserver {
	public static void main (String []args) throws IOException {
		ServerSocket sc =new ServerSocket(7777);
		Socket a=sc.accept();
		System.out.println("建立连接了！");
		
		DataInputStream dis =new DataInputStream(a.getInputStream());
		System.out.println(dis.readUTF());
		a.close();
		dis.close();
		
	}

}
