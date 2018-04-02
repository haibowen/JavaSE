package com.haibowen;


public class arrysort {
	public static void main (String [] args) {
		int b;
		int a[]= {1,8,7,5,9,2,4,6,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
				
			}
			System.out.print(a[i]+" ");
			
		}
		
		
	}

}
