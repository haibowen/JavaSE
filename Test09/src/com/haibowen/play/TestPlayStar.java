package com.haibowen.play;

public class TestPlayStar {
	
	public static void main(String[] args) {
		
		for (int a=1;a<=10;a++) {
			
			
			for(int b=1;b<=10-a;b++) {
				
				System.out.print(" ");
			}
			
			for(int c=1;c<=2*a-1;c++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	

}
