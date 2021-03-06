import java.net.InetSocketAddress;

import org.apache.mina.common.ConnectFuture;
import org.apache.mina.common.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

public class MinaClient {     
    
    public static void main(String []args)throws Exception{     
             
        //Create TCP/IP connection     
        NioSocketConnector connector = new NioSocketConnector();     
             
        //创建接受数据的过滤器     
        DefaultIoFilterChainBuilder chain = connector.getFilterChain();     
             
        //设定这个过滤器将一行一行(/r/n)的读取数据     
        chain.addLast("myChin", new ProtocolCodecFilter(new TextLineCodecFactory()));     
             
        //客户端的消息处理器：一个SamplMinaServerHander对象     
        connector.setHandler(new MinaClientHandler());     
             
        //set connect timeout     
        connector.setConnectTimeout(30);     
             
        //连接到服务器：     
        ConnectFuture cf = connector.connect(new InetSocketAddress("localhost",8888));     
             
        //Wait for the connection attempt to be finished.     
        cf.awaitUninterruptibly();     
             
        cf.getSession().getCloseFuture().awaitUninterruptibly();     
             
        connector.dispose();     
    }    
}  
