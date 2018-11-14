package com.haibowen.top;

public class Test implements Runnable {
	
	public static void main(String[] args) {
		
		LogUtils.getInstance().debug("hello");
		System.out.println(LogUtils.getInstance());
		System.out.println("***********************88");
		 Test runnable = new Test();
	        Thread thread = new Thread(runnable);
	        thread.start();
	        
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		LogUtils.getInstance().debug("world");
		System.out.println(LogUtils.getInstance());
		
		
		
		
	}
	

}
