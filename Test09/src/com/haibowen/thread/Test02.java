package com.haibowen.thread;

public class Test02  extends Thread{

	/**
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
      for (int i=0;i<10;i++) {
			
			System.out.println("hello world");
		}
		
	}
	**/
	public void start() {
		
		for (int i=0;i<10;i++) {
			
			System.out.println("hello sun");
		}
		
		
	}
}
