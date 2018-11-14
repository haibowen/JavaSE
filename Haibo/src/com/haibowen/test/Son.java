package com.haibowen.test;

public class Son {
	
	public class Father_1 extends Father{
		
		public int Strong() {
			
			
			return super.Strong()+1;
			
			
		}
		
		
		
	}
	public class Mother_1 extends Mother{
		
		public int Kind() {
			
			return super.Kind()-2;
					
		}
	}
	
	
	public int getStrong() {
		
		return new Father_1().Strong();
		
	}
	public int getKind() {
		
		return new Mother_1().Kind();
	}

}
