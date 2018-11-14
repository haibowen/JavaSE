package com.haibowen;

public class ThreadTest implements Runnable {
	

	

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"run ....");
		
	}
	
	

	public static void main(String[] args) {
		ThreadTest threadTest=new ThreadTest();
		for(int i=0;i<5;i++) {
			
		
		new Thread(new ThreadTest(),"Thread"+i).start();
		//new Thread (threadTest,"Thread"+i).start();
			
			
		}
	}
	
	

}
