package com.haibowen1;

public class TestInnerClass02 {
	
	public void show() {
		
		
		System.out.println("hello world");
		
		
	}
	
	public class Innerclass02{
		
		public TestInnerClass02 getTestinnerClass01() {
			
			return TestInnerClass02.this;
			
			
			
		}
		
		
	}
	public static void main(String[] args) {
		TestInnerClass02 test1=new TestInnerClass02();
		TestInnerClass02.Innerclass02 iii=test1.new Innerclass02();
		iii.getTestinnerClass01().show();
	}

}
