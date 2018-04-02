import java.util.Scanner;

import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;

public class MinaClientHandler extends IoHandlerAdapter {  
	    // 当客户端连接进入时  
	    @Override  
	    public void sessionOpened(IoSession session) throws Exception {  
	        System.out.println("incomming 客户端: " + session.getRemoteAddress());  
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
	        System.out.println("客户端发送信息异常....");  
	    }  
	  
	    // 当客户端发送消息到达时  
	    @Override  
	    public void messageReceived(IoSession session, Object message)  
	            throws Exception {  
	  
	        System.out.println("服务器返回的数据：" + message.toString());  
	    }  
	  
	    @Override  
	    public void sessionClosed(IoSession session) throws Exception {  
	        System.out.println("客户端与服务端断开连接.....");  
	    }  
	  
	    @Override  
	    public void sessionCreated(IoSession session) throws Exception {  
	       
	    }  
	  
	}  

