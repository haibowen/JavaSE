package com.haibowen1;

import com.haibowen.Test;

public class TestInnerClass01 {
	
	public void dissplay() {
		
		System.out.println("hello everybody");
		
	}
	
	public class Innerinnerclass{
		
		public TestInnerClass01 getTestInnerClass01() {
			
			
			
			return TestInnerClass01.this;
			
		
		}
		
		
	}
	
	public static void main(String[] args) {
		TestInnerClass01 test=new TestInnerClass01();
		
	     TestInnerClass01.Innerinnerclass ii=test.new Innerinnerclass();
	     ii.getTestInnerClass01().dissplay();
	     
	}

}
