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
		if(sex.equals("��")) {
			sex="��";
			
		}else if(sex.equals("Ů")) {
			sex="Ů";
		}else {
			System.out.println("�����������������");
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
			
			System.out.println("�������");
		}else {
			
			this.age = age;
		}
		
	}
	
	

}
