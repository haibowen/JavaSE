import java.io.*;
import java.net.*;
public class ChatClient {
	public static void main (String [] args) throws UnknownHostException, IOException {
		Socket s=new Socket("127.0.0.1",3333);
		
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF("hello");
		DataInputStream dis=new DataInputStream(s.getInputStream());
		dis.readUTF();
		if(dis.readUTF()=="bye") {
			dos.close();
			dis.close();
			s.close();
			
		}
	}

}
