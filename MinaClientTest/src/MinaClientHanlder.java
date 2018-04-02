

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlSchemaType.DEFAULT;

import org.apache.log4j.net.SyslogAppender;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class MinaClientHanlder extends IoHandlerAdapter {  
	protected DEFAULT message;
		

 public void sessionOpened(IoSession session) throws Exception { 
	 
	      Scanner scanner = new Scanner(System.in);
	      String []a=new String[3];
          if(scanner.hasNext()){
        	  
        	  a[0]=scanner.next();
        	  a[1]=scanner.next();
        	  a[2]=scanner.next();
        	  
          }    
          session.write(a);
	      }    
 public void sessionClosed(IoSession session)  
 {  
   System.out.println("client close");  
 }  
   
 public void messageReceived(IoSession session , Object message)throws Exception  
 {  
  System.out.println(message) ;  
    
 }  
}