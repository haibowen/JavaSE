package com.haiibowen;


	import java.io.BufferedReader;  
	import java.io.IOException;  
	import java.io.InputStreamReader;  
	import java.io.PrintWriter;  
	import java.net.ServerSocket;  
	import java.net.Socket;  
	public class server {
	    public static void main(String[] args) throws IOException { //���쳣ȫ���׳�   
	        ServerSocket server = new ServerSocket(10001);    //��serversocket����������������ָ���˿ں�  
	        System.out.println("����������������");  
	      
	            Socket socket = server.accept();  //��ȡ�ͻ��˵�socket��Ϣ  
	            BufferedReader in = null;    
	            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //����������   
	            while (true) {    
	                  String msg = in.readLine(); // ���ͻ��˷���������Ϣ�洢��msg��   
	                  System.out.println(msg);     
	                  if (msg.equals("shutdown")) {  //�ͻ���������͵���shutdown���͹رտͻ���  
	                        break;    
	                  }    
	             }  
	             in.close(); //ִ����Ӧ�Ĺرղ���                   
	    }    
	}  


