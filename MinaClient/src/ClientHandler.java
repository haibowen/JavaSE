import java.net.InetSocketAddress;

import org.apache.mina.common.IoConnector;
import org.apache.mina.common.IoHandler;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

public class ClientHandler {
	
	 private IoConnector ioConnector;
	     
	     public void MinaClient(String host, int port)
	     {
	         ioConnector = new NioSocketConnector();
	          //������Ϣ����װ���ı���ʽ���
	          ioConnector.getFilterChain().addLast("test", new ProtocolCodecFilter(new TextLineCodecFactory()));
	          
	         ioConnector.setHandler((IoHandler) new ClientHandler());
	         ioConnector.connect(new InetSocketAddress(host, port));
	     }

}
