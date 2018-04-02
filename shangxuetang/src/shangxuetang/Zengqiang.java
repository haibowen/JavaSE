package shangxuetang;
import java.util.*;

public class Zengqiang {
	public static void main (String []arges) {
		int [] i= {1,2,3,4,5,6,7,8,9};
		for(int j: i){
		System.out.print(j+" ");
		}
		
		Collection c=new ArrayList();
		c.add(1);
		c.add(new Integer(2));
		c.add(new String("wenhaibo"));
		System.out.println();
		for(Object o : c) {
			System.out.println(o);
			
		}
		
		
	}

}
