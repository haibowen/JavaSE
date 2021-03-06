import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.common.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class MinaServer {
	private IoAcceptor ioAcceptor;
	     
	    public MinaServer(int port)
	    {
	         ioAcceptor = new NioSocketAcceptor();
	         try {
	             //设置处理器
	             ioAcceptor.setHandler(new MyHandler());
	             //绑定端口
	             ioAcceptor.bind(new InetSocketAddress(port));
	            //规定协议，设定过滤，这里用TextLineCodecFactory文本协议
	             ioAcceptor.getFilterChain().addLast("test", new ProtocolCodecFilter(new TextLineCodecFactory()));
	         } catch (IOException e) {
	             e.printStackTrace();
	        }
	     }
	 }

