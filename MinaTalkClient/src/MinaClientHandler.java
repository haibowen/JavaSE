import java.util.Scanner;

import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;

public class MinaClientHandler extends IoHandlerAdapter {  
	    // ���ͻ������ӽ���ʱ  
	    @Override  
	    public void sessionOpened(IoSession session) throws Exception {  
	        System.out.println("incomming �ͻ���: " + session.getRemoteAddress());  
	        session.write("i am coming");  
	    	Scanner SC=new Scanner(System.in);
	    	String Send[]=new String[3];
	    	
	    		if(SC.hasNext()) {
	    		Send[0]=SC.next();
	    		Send[1]=SC.next();
	    		Send[2]=SC.next();
	    	}
	    	
	    	session.write(Send);
	    }  
	  
	    @Override  
	    public void exceptionCaught(IoSession session, Throwable cause)  
	            throws Exception {  
	        System.out.println("�ͻ��˷�����Ϣ�쳣....");  
	    }  
	  
	    // ���ͻ��˷�����Ϣ����ʱ  
	    @Override  
	    public void messageReceived(IoSession session, Object message)  
	            throws Exception {  
	  
	        System.out.println("���������ص����ݣ�" + message.toString());  
	    }  
	  
	    @Override  
	    public void sessionClosed(IoSession session) throws Exception {  
	        System.out.println("�ͻ��������˶Ͽ�����.....");  
	    }  
	  
	    @Override  
	    public void sessionCreated(IoSession session) throws Exception {  
	       
	    }  
	  
	}  

