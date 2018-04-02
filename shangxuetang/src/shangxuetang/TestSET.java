package shangxuetang;
import java.util.*;

public class TestSET {
	public static void main(String [] args) {
		Set a=new HashSet();
		Set b= new HashSet();
		
		a.add(1);
		a.add(2);
		a.add(3);
		b.add(1);
		b.add(2);
		b.add(4);
		
		
		Set a1=new HashSet(a);
		a1.addAll(a);
		Set b1=new HashSet(b);
		b1.retainAll(b);
		System.out.println(a1);
		System.out.println(b1);
		
		
		
		
	}

}
