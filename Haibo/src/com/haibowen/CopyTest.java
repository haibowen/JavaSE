package com.haibowen;
/**
 * 
 * Copy test 
 * @author Administrator
 * @param <Email>
 *
 */

public class CopyTest implements Cloneable {
	
	//ÐÕÃû
	private String name;
	//ÓÊ¼þ
	private String  sex;
	
	
	
	
	
	
	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getName() {
		return name;
	}
	


	public void setName(String name) {
		this.name = name;
	}


	public CopyTest(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	


	public CopyTest(String sex) {
		super();
		this.sex = sex;
	}


	protected  CopyTest clone() {
		
		
		CopyTest cop=null;
		try {
			 cop=(CopyTest)super.clone();
			 
			
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
			
			
		}
		return cop;
		
		
		
		
		
	}


	
	



	

}
