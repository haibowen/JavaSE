package sever_1;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.net.ServerSocket;  
import java.net.Socket;  
public class server_1 {    
    public static void main(String[] args) throws IOException { //���쳣ȫ���׳�   
        ServerSocket server = new ServerSocket(60000);    //��serversocket����������������ָ���˿ں�  
        System.out.println("���������� �ˣ����ڵȴ��������ݡ�����");  
      
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
