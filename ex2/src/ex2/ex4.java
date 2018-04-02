package ex2;

import edu.princeton.cs.algs4.In;

public class ex4 extends  ex1 {
	public static void main(String [] args) {
		String []a =In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
		
	}
	public static void sort(Comparable[]a) {
		int N=a.length;
		for (int i=1;i<N;i++) {
			for(int j=i;j>0 && less(a[j],a[j-1]);j--) {
				exch(a,j,j-1);
			}
			
		}
		
	}

}
