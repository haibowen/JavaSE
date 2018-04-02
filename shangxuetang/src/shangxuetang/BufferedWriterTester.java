package shangxuetang;
import java.io.*;


public class BufferedWriterTester {
	public static void main (String []arges) throws IOException {
		String fileName ="F:/newhello.txt";
		BufferedWriter out=new BufferedWriter(new FileWriter(fileName));
		out.write("Hello!");
		out.newLine();
		out.write("djfaskfajfkdkfdjkk");
		out.newLine();
		out.write("haiboya");
		out.close();
		
		
	}

}
