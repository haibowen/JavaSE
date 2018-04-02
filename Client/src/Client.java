
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class Client {
	/**
	14      * Socket�ͻ���
	15      */
	    public static void main(String[] args) {
        try {
             //����Socket����
	            Socket socket=new Socket("192.168.85.47",119);
	            
	            //��������������ͷ��������
	             OutputStream outputStream=(OutputStream) socket.getOutputStream();//��ȡһ��������������˷�����Ϣ
	            PrintWriter printWriter=new PrintWriter(outputStream);//���������װ�ɴ�ӡ��
             printWriter.print("�������ã�����Balla_����");
	            printWriter.flush();
            socket.shutdownOutput();//�ر������
	            
            InputStream inputStream=(InputStream) socket.getInputStream();//��ȡһ�������������շ���˵���Ϣ
	            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);//��װ���ַ��������Ч��
	            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);//������
            String info="";
            String temp=null;//��ʱ����
            while((temp=bufferedReader.readLine())!=null){
                info+=temp;
                 System.out.println("�ͻ��˽��շ���˷�����Ϣ��"+info);
	            }
             
             //�ر����Ӧ����Դ
            bufferedReader.close();
	            inputStream.close();
           printWriter.close();            outputStream.close();
             socket.close();
        } catch (UnknownHostException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
            e.printStackTrace();
	       }
	    }
}





