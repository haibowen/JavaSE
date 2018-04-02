package Demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public class MinaServerHanlder extends  IoHandlerAdapter  {
	 private int count = 0; // 由底层决定是否创建一个session  
	 public void sessionCreated(IoSession session) {  
		  System.out.println("新客户连接");  
		 }// 创建了session 后会回调sessionOpened 


	 public void sessionOpened(IoSession session) throws Exception {  
		  count++;    
		  System.out.println("第 " + count + " 个 client 登陆！address： : "  
		    + session.getRemoteAddress());  
		 }// 当收到了客户端发送的消息后会回调这个函数  

	 public void messageReceived(IoSession session, Object message)  
			   throws Exception {  
		
		     
			        
			        String []aa = new String[3];
	                aa = (String[])message;
			        System.out.println("服务器收到客户端发送指令 ：" + aa[0]+" "+aa[1]+" "+aa[2]);
			
		            int a = Integer.parseInt(aa[0]);
		            int b = Integer.parseInt(aa[1]);
		            int c = Integer.parseInt(aa[2]);
		            if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a){
		            	session.write("可以构成三角形");
		            	
		            }else {
						session.write("不能构成三角形");
						
		           }  
		         
		           
		            
			      
			     
		         
			     
			        }
	 // 发送成功后会回调的方法  
			 public void messageSent(IoSession session, Object message) {  
			  System.out.println("message send to client");  
			 } // session 关闭调用  

			 public void sessionClosed(IoSession session) {  
				  System.out.println("one client disconnect");  
				 } // session 空闲的时候调用 
			 public void sessionIdle(IoSession session, IdleStatus status) {  
				  System.out.println("connect idle");  
				 }// 异常捕捉  

			 public void exceptionCaught(IoSession session, Throwable cause) {  
				  System.out.println("throws exception");  
				 } 



}