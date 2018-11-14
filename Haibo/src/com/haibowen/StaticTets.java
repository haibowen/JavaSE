package com.haibowen;

public class StaticTets {
	
	static int a=1234;
	int b=1234;
	public StaticTets() {
		
		a++;
		b++;
	}
	public static void main(String[] args) {
		StaticTets a1=new StaticTets();
		StaticTets a2=new StaticTets();
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println("******************");
		System.out.println(a1.b);
		System.out.println(a2.b);
	}

}



