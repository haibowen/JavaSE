package com.haibowen1;

public class PrivateInnerClass {
	
	private String str;
	
	public void display() {
		
		System.out.println("��Ա�ڲ���");
		
		
	}
	
	public class Innerclass{
		
		public void  Innerclassdisplay() {
			
			str="wenhaibo";
			System.out.println(str);
			display();
			
			
			
		}
		
		
	}
	
	public Innerclass getinnerclass() {
		
		return  new Innerclass();
	}
	
	public static void main(String[] args) {
		
		PrivateInnerClass pra=new PrivateInnerClass();
		PrivateInnerClass.Innerclass iner=pra.getinnerclass();
		iner.Innerclassdisplay();
		
		
	}
	
	
	

}
