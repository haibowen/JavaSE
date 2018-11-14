package com.haibowen1;

public class AnonoymousInnerclass {
	
	public Innerclass getInnerclass(final int num,String str2) {
		
		return new Innerclass() {
			
			int number=num+10;
		public	int getNumber(){
				
				return number;
			}
			
		};
		
		
		
	}
	public static void main(String[] args) {
		AnonoymousInnerclass ano=new AnonoymousInnerclass();
		Innerclass inner=ano.getInnerclass(12, "wenhaibo");
		System.out.println(inner.getNumber());
	}

}


