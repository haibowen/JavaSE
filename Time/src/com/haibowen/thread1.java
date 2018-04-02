 package com.haibowen;

public class thread1 {
	public static void main(String []args){
		TestThread[] runners =new TestThread[2];
		
		for (int i=0;i<2;i++) {
			runners[i]=new TestThread(i);
			
		}
		
		runners[0].setPriority(2);
		runners[1].setPriority(3);
		for (int i=0;i<2;i++) {
			runners[i].start();
		}			
	}

}
class TestThread extends Thread{
	private  int a=1;
	private int b=1;
	public TestThread (int i){
		this.b=i;
	}
	
	
	public void run (){
		while (a<1000){
			a++;
			
		}
		System.out.println("Thread #"+b+"is over!");
		
	}
}