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
             
        //�����������ݵĹ�����     
        DefaultIoFilterChainBuilder chain = connector.getFilterChain();     
             
        //�趨�����������һ��һ��(/r/n)�Ķ�ȡ����     
        chain.addLast("myChin", new ProtocolCodecFilter(new TextLineCodecFactory()));     
             
        //�ͻ��˵���Ϣ��������һ��SamplMinaServerHander����     
        connector.setHandler(new MinaClientHandler());     
             
        //set connect timeout     
        connector.setConnectTimeout(30);     
             
        //���ӵ���������     
        ConnectFuture cf = connector.connect(new InetSocketAddress("localhost",8888));     
             
        //Wait for the connection attempt to be finished.     
        cf.awaitUninterruptibly();     
             
        cf.getSession().getCloseFuture().awaitUninterruptibly();     
             
        connector.dispose();     
    }    
}  
