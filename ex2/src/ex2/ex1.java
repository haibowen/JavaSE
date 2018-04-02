package ex2;

import java.util.Scanner;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ex1 {
	public static void main (String []args) {
		String []a =In.readStrings();
		sort(a);
		assert isSorted(a);
		show(a);
		
		
	}
	
	
	public static void sort (Comparable[]a) {
		int N=a.length;
		for(int i=0;i<N;i++) {
			int min=i;
			for(int j=i+1;j<N;j++) {
				if(less(a[j],a[min]))
					min=j;
				exch(a,i,min);
			}
		}
		
	}
	protected static void exch(Comparable[] a, int i, int j) {
		// TODO Auto-generated method stub
		Comparable t=a[i];a[i]=a[j];a[j]=t;
		
	}
	protected static boolean less(Comparable v, Comparable w) {
		// TODO Auto-generated method stub
		return v.compareTo(w)<0;
	}
	protected static boolean isSorted(Comparable[]a) {
		// TODO Auto-generated method stub
		for(int i=1;i<a.length;i++) 
			if(less(a[i],a[i-1]))
		return false;
		
	return true;	
	}
	protected static void show(Comparable[]a) {
		// TODO Auto-generated method stub
		for (int i=0;i<a.length;i++) {
			StdOut.print(a[i] +"");
		StdOut.println();	
		}
		
	}

}
