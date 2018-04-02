
import java.util.Date;

import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;  
  
public class TimeServerHandler extends IoHandlerAdapter {  
  
    public void exceptionCaught(IoSession session, Throwable cause)  
            throws Exception {  
        cause.printStackTrace();  
    }  
  
    /* 
     * ���������Ŀǰ�����������Ҫ�ģ� 
     * �����յ���Ϣ��ֻҪ����quit���Ͱѷ�������ǰ��ʱ�䷵�ظ��ͻ��� 
     * �����quit����رտͻ�������*/  
    @Override  
    public void messageReceived(IoSession session, Object message)  
            throws Exception {  
        String str = message.toString();  
        if (str.trim().equalsIgnoreCase("quit")) {  
            session.close();  
            return;  
        }  
        
        
        
        //Date date = new Date();  
        System.out.println(str+session.getRemoteAddress()+date.toString()); 
        System.out.println(str+session.toString());  
          
        session.write("i am recived");  
        System.out.println("Message written...");  
  
    }  
      
    @Override  
    public void sessionClosed(IoSession session) throws Exception {  
        // TODO Auto-generated method stub  
        super.sessionClosed(session);  
        System.out.println("�ͻ��������˶Ͽ�����.....");  
    }  
  
}  