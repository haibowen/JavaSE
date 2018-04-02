import org.apache.mina.common.IoHandlerAdapter;
import org.apache.mina.common.IoSession;

public class MyHandler extends IoHandlerAdapter {
	
	public void messageReceived(IoSession session, Object message)
	             throws Exception {
	        String getmessage = message.toString();
	        System.out.println(getmessage);
	     }

}
