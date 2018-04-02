package shangxuetang;

import java.util.*;

public class SetTest {
	public static void main(String []args) {
		Set s1=new HashSet();
		Set s2=new HashSet();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s2.add("a");
		s2.add("b");
		s2.add("d");
		Set s3=new HashSet(s1);
		s3.retainAll(s2);
		Set s4=new HashSet(s2);
	     
	     s4.addAll(s1);
		System.out.println(s3);
		System.out.println(s4);
		
		
	
	}

}
