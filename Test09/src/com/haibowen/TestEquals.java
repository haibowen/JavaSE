package com.haibowen;

public class TestEquals {
	
	public static void main(String[] args) {
		String a="abcd";
		String b="abcd";
		String c=new String ("abcd");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b.equals(c));
		
	}

}
