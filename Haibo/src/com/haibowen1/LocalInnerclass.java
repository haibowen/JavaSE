package com.haibowen1;

/**
 * 
 *          �ֲ��ڲ���  �����ڷ�����
 *        
 * 
 * @author Administrator
 *
 */

public class LocalInnerclass {
	
	
	public Destiontion destiontion(String str) {
		
		class PDestiontion implements Destiontion{
			
			private String label;
			private PDestiontion(String whereTO) {
				label=whereTO;
				
				
			}
			
			public String readlable() {
				
				return label;
				
			}
		}
		return new PDestiontion(str);
		
		
	}
	
	public static void main(String[] args) {
		LocalInnerclass ll=new LocalInnerclass();
		Destiontion dd=ll.destiontion("wenhaibo");
	}
	
	

}
