package com.haibowen;

public class Husband {
	
	private String name;
	private String Sex;
	private String Hobby;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		
		return Sex;
	}
	public void setSex(String sex) {
		if(sex.equals("男")) {
			sex="男";
			
		}else if(sex.equals("女")) {
			sex="女";
		}else {
			System.out.println("输入错误，请重新输入");
		}
	
	}
	public String getHobby() {
		return Hobby;
	}
	public void setHobby(String hobby) {
		Hobby = hobby;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age>120) {
			
			System.out.println("输入错误");
		}else {
			
			this.age = age;
		}
		
	}
	
	

}
