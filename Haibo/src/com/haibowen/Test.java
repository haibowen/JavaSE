package com.haibowen;

public class Test extends Test1 {

	
	Test(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("constructor test");
	}

	

	public static void main (String [] args) {
		Test test=new Test(0);
		
		//System.out.println(test);
		Test te=new Test(0);
		String a=te.eat();
		System.out.println(a);
		
		
	}

}
class Test1{
	String apple ="iphone";
	Test1(int i){
		
		System.out.print("constructor Test1");
	}
	protected String eat() {
		
		return apple;
	}
	

}

