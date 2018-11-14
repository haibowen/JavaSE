package com.haibowen1;



public class PrivateInnerclassTest02 {
	
	private void show(boolean a) {
		
		if(a) {
			
			
			class Innnerclasstt{
				
				private String id;
				Innnerclasstt(String s){
					id=s;
					
				}
				
				String getInnerclasstt() {
					
					return id;
				}
			}
			
			Innnerclasstt ii=new Innnerclasstt("wenhaibo");
			String str=ii.getInnerclasstt();
			System.out.println(str);
			
			
			
		}
		
	}
	
	public void track() {
		
		show(true);
	}
	
	public static void main(String[] args) {
		PrivateInnerclassTest02 pra=new PrivateInnerclassTest02();
		pra.track();
	}

}
