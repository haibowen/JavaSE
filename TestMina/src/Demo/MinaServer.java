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
	        //����ServerScoket  
	        SocketAcceptor acceptor = new NioSocketAcceptor();  
	        //���ô��䷽ʽ���������óɶ�����ģʽ�����кܶ�����ͺ������彲��  
	        DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();  
	        ProtocolCodecFilter filter = new ProtocolCodecFilter(  
	                new ObjectSerializationCodecFactory());  
	        chain.addLast("objectFilter", filter);  
	        // �����Ϣ����  
	  
	        acceptor.setHandler(new MinaServerHanlder());  
	        // ����������   
	        int bindPort = 9988;  
	        try {  
	                      acceptor.bind(new InetSocketAddress(bindPort));  
	        } catch (IOException e) {  
	                            e.printStackTrace();  
	                  }  
	     
	  
	} 
}
