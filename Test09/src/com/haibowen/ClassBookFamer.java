package com.haibowen;

public class ClassBookFamer {
	
	public  static  final  int xml=0;
	public static final int json=1;
	
	
	public String  BookFramer( Book book,int type) {
	   String result="";
		
		if(type==xml) {
			
			
			System.out.println("begain");
			result+="<book name>"+book.getName()+"</book name>\n";
			result+="<book author>"+book.getAuthor()+"</book author>\n";
			result+="<book page>"+book.getPage()+"</book page>\n";
			result+= "<book price>"+book.getPrice()+"</book price>\n";
			result+="<book data>"+book.getData()+"</book data>\n";
			System.out.println("over");
			
			
		}
		if (type==json) {
			
            System.out.println("begain");
			result+="{\n";
			result+="\"book name\" :\""+book.getName()+"\",\n";
			result+="\"book author\" :\""+book.getAuthor()+"\",\n";
			result+="\"book page\" :\""+book.getPage()+"\",\n";
			result+="\"book price\" :\""+book.getPrice()+"\",\n";
			result+="\"book data\" :\""+book.getData()+"\",\n";
			result+="}";			
			System.out.println("over");
			
		}
		
		return  result;
		
	}

}
