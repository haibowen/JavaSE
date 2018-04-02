package sever_1;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.net.ServerSocket;  
import java.net.Socket;  
public class server_1 {    
    public static void main(String[] args) throws IOException { //将异常全部抛出   
        ServerSocket server = new ServerSocket(60000);    //用serversocket来启动服务器，并指定端口号  
        System.out.println("服务器启动 了，正在等待您的数据。。。");  
      
            Socket socket = server.accept();  //获取客户端的socket信息  
            BufferedReader in = null;    
            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //启动缓冲区   
            while (true) {    
                  String msg = in.readLine(); // 将客户端发送来的信息存储在msg中   
                  System.out.println(msg);     
                  if (msg.equals("shutdown")) {  //客户端如果发送的是shutdown，就关闭客户端  
                        break;    
                  }    
             }  
             in.close(); //执行相应的关闭操作                   
    }    
}  
