package com.haibowen.play;

/**
 *  
 * @author Administrator
 *
 */
public class Testplay3 {
	public static void main(String[] args) {
		
		//数据源
		String  []array= {"A","B","C","D","E"};
		int [] array1= {1,2,3,4};
		
		//遍历
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+":");
			
			for(int j=0;j<array1.length;j++) {
				
				System.out.print(array1[j]);
			}
			System.out.println();
		}
		
		
	}

}
