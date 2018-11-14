package com.haibowentest;

public class XMLType  extends FamerFactory{
public static final int xml=0;
	@Override
	protected String famer(Book book) {
		// TODO Auto-generated method stub
		String result="";
		result+="<book name>"+book.getName()+"</book name>\n";
		result+="<book author>"+book.getAuthor()+"</book author>\n";
		result+="<book page>"+book.getPage()+"</book page>\n";
		result+= "<book price>"+book.getPrice()+"</book price>\n";
		result+="<book data>"+book.getData()+"</book data>\n";	
		return result;
	}
	
	@Override
	public String famerbook(Book book, int Type) {
		// TODO Auto-generated method stub
		if(Type==0) {
			String result="";
			result+="<book name>"+book.getName()+"</book name>\n";
			result+="<book author>"+book.getAuthor()+"</book author>\n";
			result+="<book page>"+book.getPage()+"</book page>\n";
			result+= "<book price>"+book.getPrice()+"</book price>\n";
			result+="<book data>"+book.getData()+"</book data>\n";	
			
			
		}
		
		return super.famerbook(book, Type);
	}

}
