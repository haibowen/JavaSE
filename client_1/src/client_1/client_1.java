package client_1;

import java.io.BufferedReader;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.net.Socket;  
  
public class client_1 {    
    public static void main(String[] args) throws Exception {    
        System.out.println("�ͻ�������");  
        Socket socket = new Socket("192.168.43.221", 60000);  //����socket�������ӱ�����������Ӧ�˿ں�  
        PrintWriter out = new PrintWriter(socket.getOutputStream());    
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//�ӿ���̨��ȡ���������    
        //���ϵĻ�ȡ��������ݣ������ϵķ��͸���������������shutdownʱ������ѭ����ֹͣ����  
        while (true) {    
            String msg = reader.readLine();    
            out.println(msg);    
            out.flush();    
            if (msg.equals("shutdown")) {    
                break;    
            }    
        }    
        //ִ����Ӧ�Ĺرղ���  
        socket.close();  
        out.close();  
        reader.close();  
    }    
}    