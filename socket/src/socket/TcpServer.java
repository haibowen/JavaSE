package socket;

import java.io.*;
import java.net.*;
 
public class TcpServer {
    private static Object exit;

	public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(19091);
        try {
            Socket client = server.accept();
            try {
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(client.getInputStream()));
                boolean flag = true;
                int count = 1;
 
                while (flag) {
                    System.out.println("�ͻ���Ҫ��ʼ��,���ǵ�" + count +" �Σ�");
                    count++;
                     
                    String line = input.readLine();
                    System.out.println("�ͻ���˵��" + line);
                     
            
					if (line.equals(exit)) {
                        flag = false;
                        System.out.println("�ͻ��˲������ˣ�");
                    } else {
                        System.out.println("�ͻ���˵��"  + line);
                    }
 
                }
            } finally {
                client.close();
            }
             
        } finally {
            server.close();
        }
    }
}