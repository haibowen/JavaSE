package com.haiowen;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.logging.Logger;

import org.apache.mina.common.IdleStatus;
import org.apache.mina.common.IoAcceptor;
import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.slf4j.LoggerFactory;

public class MyServer {
	public static void main (String [] args) throws IOException {
		

	IoAcceptor acceptor=new NioSocketAcceptor();  
	acceptor.getSessionConfig().setReadBufferSize(2048);  
	acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE,10);
	
	
	acceptor.getFilterChain().addLast("codec",  
			new ProtocolCodecFilter(  
			new TextLineCodecFactory(  
			Charset.forName("UTF-8"),  
			LineDelimiter.WINDOWS.getValue(),  
			LineDelimiter. WINDOWS.getValue() 
			)
			)
			);
	
	acceptor.setHandler(new MyIoHandler());  
	acceptor.bind(new InetSocketAddress(9123));  

}
}


class MyIoHandler extends IoHandlerAdapter {  
	// 这里我们使用的SLF4J作为日志门面，至于为什么在后面说明。   
	private final static org.slf4j.Logger log = LoggerFactory  
			.getLogger(MyIoHandler.class);   
	@Override  
	public void messageReceived(IoSession session, Object message)  
	throws Exception {  
	String str = message.toString();  
	log.info("The message received is [" + str + "]");  
	if (str.endsWith("quit")) {  
	session.close(true);  
	return;  
	}  
	}  
	}  