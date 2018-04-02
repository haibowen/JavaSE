package shangxuetang;
import java.lang.*;

public class StringTest {
	public static void main(String [] args) {
		java.lang.String s= "aslkjsksjkfjFKDGF:FHK:FG:FLF:L:DLFnmcmnvm";
		int Icount=0;
		int Ucount=0;
		int Ocount=0;
		/*
		
		for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>'a'&&c<'z') {
			Icount++;
			
		}else if (c>'A'&&c<'Z') {
			Ucount++;
			
		}else {
			Ocount++;
			
		}
		
		}
		*/
		
		
		/*
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(isLowerCase(c)) {
				Icount++;
				
			}else if(isUpperCase(c)) {
				Ucount++;
		}else {
			Ocount++;
		}
			
		}
		System.out.println(Icount+"  " +Ucount+ "  " + Ocount+" ");
		
		
	}

	
	private static boolean isLowerCase(char c) {
		// TODO Auto-generated method stub
		if(c>'a'&&c<'z') {
			return true;
			
		}
		return false;
			
		
		
	}
	private static boolean isUpperCase(char c) {
		// TODO Auto-generated method stub
		if(c>'A'&&c<'Z') {
			return true;
		}
		return false;
		
		
	}
	*/
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isLowerCase(c)) {
				Icount++;
				
				
			}else if(Character.isUpperCase(c)){
				Ucount++;
				
			}else {
				Ocount++;
			}
		}
		System.out.println(Icount+"  " +Ucount+ "  " + Ocount+" ");
		


 }
}
