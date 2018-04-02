package shangxuetang;
import java.util.*;

public class TestCollection {
	public static void main (String [] args) {
		Collection c=new HashSet();
		c.add("hello");
		c.add(new String("wenhaibo"));
		c.add(new Integer(1000));
		c.remove("hello");
		c.remove("100");
		System.out.println(c.size());
		c.clear();
		//
		System.out.println(c.remove(new String("wenhaibo")));
		System.out.println(c);
		
 		
	}

}
