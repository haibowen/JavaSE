import java.io.*;
import java.net.*;
public class ChatServer {
	public static void main (String []args) throws IOException {
		
		ServerSocket sc =new ServerSocket(3333);
		Socket s=sc.accept();
		DataInputStream dis=new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());
		DataOutputStream dos =new DataOutputStream(s.getOutputStream());
		if(dis.readUTF()=="bye") {
			dos.close();
			dis.close();
			s.close();
			
		}
	}

}
