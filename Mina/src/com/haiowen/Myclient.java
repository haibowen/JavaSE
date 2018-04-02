package com.haiowen;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.common.IoConnector;
import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Myclient {
	public static void main (String []args) {
		

	
	IoConnector connector=new NioSocketConnector();  
	connector.setConnectTimeout(30000);  
	connector.getFilterChain().addLast("codec",  
	new ProtocolCodecFilter(  
	new TextLineCodecFactory(  
	Charset.forName("UTF-8"),  
	LineDelimiter.WINDOWS.getValue(),  
	LineDelimiter.WINDOWS.getValue()  
	)  
	)  
	);  
	connector.setHandler(new ClientHandler("你好！/r/n 大家好！"));  
	
	connector.connect(new InetSocketAddress("localhost", 9123));  
	
	}  
}
 class ClientHandler extends IoHandlerAdapter {  
    private final static Logger LOGGER = LoggerFactory  
.getLogger(ClientHandler.class);  
    private final String values;  
    public ClientHandler(String values) {  
         this.values = values;  
    }  
  @Override  
       public void sessionOpened(IoSession session) {  
              session.write(values);  
        }  
  }  
