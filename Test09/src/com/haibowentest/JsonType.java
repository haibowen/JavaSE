package com.haibowentest;

public class JsonType extends FamerFactory {

	@Override
	protected String famer(Book book) {
		// TODO Auto-generated method stub
		String result="";
		result+="{\n";
		result+="\"book name\" :\""+book.getName()+"\",\n";
		result+="\"book author\" :\""+book.getAuthor()+"\",\n";
		result+="\"book page\" :\""+book.getPage()+"\",\n";
		result+="\"book price\" :\""+book.getPrice()+"\",\n";
		result+="\"book data\" :\""+book.getData()+"\",\n";
		result+="}";
		return result;
	}
	
	

}
