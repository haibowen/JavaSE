package Demo;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;



public class MinaServer   {
	  
	    public static void main(String[] args)  
	    {  
	        //创建ServerScoket  
	        SocketAcceptor acceptor = new NioSocketAcceptor();  
	        //设置传输方式（这里设置成对象传输模式，还有很多的类型后面会具体讲到  
	        DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();  
	        ProtocolCodecFilter filter = new ProtocolCodecFilter(  
	                new ObjectSerializationCodecFactory());  
	        chain.addLast("objectFilter", filter);  
	        // 添加消息处理  
	  
	        acceptor.setHandler(new MinaServerHanlder());  
	        // 开启服务器   
	        int bindPort = 9988;  
	        try {  
	                      acceptor.bind(new InetSocketAddress(bindPort));  
	        } catch (IOException e) {  
	                            e.printStackTrace();  
	                  }  
	     
	  
	} 
}
