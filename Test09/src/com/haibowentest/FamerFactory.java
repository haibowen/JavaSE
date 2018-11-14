package com.haibowentest;

public abstract  class FamerFactory {
	
	public String famerbook(Book book,int Type) {
		
		begin();
		String result=famer(book);
		end();
		return result;
		
	}
	
	public void begin() {
		
		System.out.println("begin");
	}
	
	public void end() {
		
		System.out.println("over");
		
	}
	protected abstract  String famer(Book book) ;
	
	

}
