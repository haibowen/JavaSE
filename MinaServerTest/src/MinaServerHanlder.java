

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class MinaServerHanlder extends  IoHandlerAdapter  {
	 private int count = 0; // �ɵײ�����Ƿ񴴽�һ��session  
	 public void sessionCreated(IoSession session) {  
		  System.out.println("�¿ͻ�����");  
		 }// ������session ���ص�sessionOpened 


	 public void sessionOpened(IoSession session) throws Exception {  
		  count++;    
		  System.out.println("�� " + count + " �� client ��½��address�� : "  
		    + session.getRemoteAddress());  
		 }// ���յ��˿ͻ��˷��͵���Ϣ���ص��������  

	 public void messageReceived(IoSession session, Object message)  
			   throws Exception { 
			        String []aa = new String[3];
	                aa = (String[])message;
			        System.out.println("�������յ��ͻ��˷���ָ�� ��" + aa[0]+" "+aa[1]+" "+aa[2]);
			
		            int a = Integer.parseInt(aa[0]);
		            int b = Integer.parseInt(aa[1]);
		            int c = Integer.parseInt(aa[2]);
		            if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a){
		            	session.write("���Թ���������");
		            	
		            }else {
						session.write("���ܹ���������");
						
		            }
			        }
	 // ���ͳɹ����ص��ķ���  
			 public void messageSent(IoSession session, Object message) {  
			  System.out.println("message send to client");  
			 } // session �رյ���  

			 public void sessionClosed(IoSession session) {  
				  System.out.println("one client disconnect");  
				 } // session ���е�ʱ����� 
			 public void sessionIdle(IoSession session, IdleStatus status) {  
				  System.out.println("connect idle");  
				 }// �쳣��׽  

			 public void exceptionCaught(IoSession session, Throwable cause) {  
				  System.out.println("throws exception");  
				 } 



}