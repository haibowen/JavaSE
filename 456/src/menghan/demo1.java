package menghan;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
@ServerEndpoint("/websocket")
public class demo1 {
@OnMessage
public void onMessage(String message,Session session) throws IOException, InterruptedException{
System.out.println("Receive: "+message);
//获取所有客户端的session，然后一旦接收到消息就为每一个客户端发送消息
Set sessions=session.getOpenSessions();
System.out.println(sessions.size());
Iterator it=sessions.iterator();
while(it.hasNext()){
Session s1=(Session) it.next();
s1.getBasicRemote().sendText(message);
}
  
}
@OnOpen
 public void onOpen() {
   System.out.println("Client connected");
 }
  
 @OnClose
 public void onClose() {
   System.out.println("Connection closed");
 }
}
