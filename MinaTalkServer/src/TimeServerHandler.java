import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;

public class TimeServerHandler extends IoHandlerAdapter {  
  
    @Override  
    public void exceptionCaught(IoSession session, Throwable cause)  
            throws Exception {  
        cause.printStackTrace();  
    }  
  
   
    @Override  
    public void messageReceived(IoSession session, Object message)  
            throws Exception {  
       
    	
    	 String []Receive = new String[3];
         Receive = (String[])message;
	        System.out.println("�������յ��ͻ��˷���ָ�� ��" + Receive[0]+" "+Receive[1]+" "+Receive[2]);
	
         int a = Integer.parseInt(Receive[0]);
         int b = Integer.parseInt(Receive[1]);
         int c = Integer.parseInt(Receive[2]);
         if(a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a){
         	session.write("���Թ���������");
         	
         }else {
				session.write("���ܹ���������");
				
        }  
    }  
      
    @Override  
    public void sessionClosed(IoSession session) throws Exception {  
        // TODO Auto-generated method stub  
        super.sessionClosed(session);  
        System.out.println("�ͻ��������˶Ͽ�����.....");  
    }  
  
}  
