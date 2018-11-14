package com.haibowen;

public class CloneTest1 {
	
	public static void main(String[] args) {
		
		CopyTest copy=new CopyTest("张三","man");
		CopyTest copy1=copy.clone();
		 copy1.setName("李四");
		CopyTest copy2=copy.clone();
		copy2.setName("王伟");
		copy.setSex("woman");
		System.out.println(copy.getName()+" "+" "+copy.getSex());
		System.out.println(copy1.getName()+" "+" "+copy1.getSex());
		System.out.println(copy2.getName()+" "+" "+copy2.getSex());
		
		
		
		
	}

}
