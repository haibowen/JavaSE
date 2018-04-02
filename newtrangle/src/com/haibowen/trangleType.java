package com.haibowen;

public class trangleType {
	public int result;
	public  int  trangle(int a,int b,int c) {
		if (a<0||b<0||c<0) {
			result=0;
			System.out.println("请输入正确的数据");
			
		}else if(a+b>c||a+c>b||b+c>a) {
			result=1;
		
			
		}else {
			result=2;
		}
		
		return getResult();
		
	}
	public byte  trangle1(byte a,byte b,byte c) {
		if (a<0||b<0||c<0) {
			result=0;
			System.out.println("请输入正确的数据");
			
		}else if(a+b>c||a+c>b||b+c>a) {
			result=1;
		
			
		}else {
			result=2;
		}
		
		return getResult1();
		
	}
	public short  trangle2(int a,int b,int c) {
		if (a<0||b<0||c<0) {
			result=0;
			System.out.println("请输入正确的数据");
			
		}else if(a+b>c||a+c>b||b+c>a) {
			result=1;
		
			
		}else {
			result=2;
		}
		
		return getResult2();
	}
	public float  trangle3(int a,int b,int c) {
		if (a<0||b<0||c<0) {
			result=0;
			System.out.println("请输入正确的数据");
			
		}else if(a+b>c||a+c>b||b+c>a) {
			result=1;
		
			
		}else {
			result=2;
		}
		
		return getResult3();
		
	}
	public double  trangle4(int a,int b,int c) {
		if (a<0||b<0||c<0) {
			result=0;
			System.out.println("请输入正确的数据");
			
		}else if(a+b>c||a+c>b||b+c>a) {
			result=1;
		
			
		}else {
			result=2;
		}
		
		return getResult4();
		
	}
	public long  trangle5(int a,int b,int c) {
		if (a<0||b<0||c<0) {
			result=0;
			System.out.println("请输入正确的数据");
			
		}else if(a+b>c||a+c>b||b+c>a) {
			result=1;
		
			
		}else {
			result=2;
		}
		
		return getResult5();
		
	}
	
	
	
	public int getResult() {
		return result;
	}
	public byte getResult1() {
		return (byte) result;
	}
	public short getResult2() {
		return (short) result;
	}
	public float getResult3() {
		return (float) result;
	}
	public double getResult4() {
		return (double) result;
	}
	public long getResult5() {
		return (long) result;
	}
	
	

}
