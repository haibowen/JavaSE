package ex2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ex9 extends Example {
	public static void main(String []args) {
		String a[]=In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
		
	}
	public static void sort (Comparable [] a) {
		int N=a.length;
		int h=1;
		while (h<N/3)
			h=3*h+1;
		while(h>=1)
		{
			for (int i=h;i<N;i++) {
				for (int j=i;j>=h&& less (a[j],a[j-h]);j-=h)
					
					exch(a,j,j-h);
					
				
			}
			h=h/3;
		}
	}

}
