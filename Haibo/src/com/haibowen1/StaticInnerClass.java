package com.haibowen1;

public class StaticInnerClass {
	
	private static int a=222;
	private String b="haibo";
	
	public void display(){
		System.out.println("welcome to hexunhulian");
		
		
		
	}
	/**
	 * 
	 * ��̬�ڲ���
	 * @author Administrator
	 *
	 */
	public static class innnerclass{
		public  int play() {
			return a;
			
		}
		
		
		
	}
	/**
	 * 
	 * �ڲ���
	 * 
	 * @param args
	 */
	public class Innerclass02{
		String abc=b;
		int dd=a;
		
	public void add(){
		System.out.println("��ӳɹ�");
		System.out.println(abc);
		System.out.println(dd);
		}
		
	}
	public static void main(String[] args) {
		innnerclass ii=new innnerclass();
		
		//ii.display();
		StaticInnerClass sc=new StaticInnerClass();
		StaticInnerClass.Innerclass02 ic2=sc.new Innerclass02();
	     ic2.add();
	   String jiehsou=  ic2.abc;
	   //ic2.display();
	   System.out.println(jiehsou);
		
		System.out.println(ii.play());
		
	}

}
