package comhaibowen;
import java.io.IOException;
import java.net.*;
import java.io.*;
public class TCPClient {
	public static void main (String []args) throws UnknownHostException, IOException {
		Socket s=new Socket("127.0.0.1",22222);
		
		
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		dos.writeUTF("ƒ„∫√ ¿ΩÁ£°");
		dos.flush();
		
		dos.close();
		s.close();
		
		
		
		
		
		
	}

}
