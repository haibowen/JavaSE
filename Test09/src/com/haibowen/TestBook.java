package com.haibowen;

public class TestBook {
	
	public static void main(String[] args) {
		Book book=new Book();
		
		book.setAuthor("wenhaibo");
		book.setData("2018-10-17");
		book.setName("thinking in java");
		book.setPage(500);
		book.setPrice(105.9);
		ClassBookFamer cb=new ClassBookFamer();
		String out=cb.BookFramer(book,cb.xml);
		System.out.println(out);
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		String out2=cb.BookFramer(book, cb.json);
		System.out.println(out2);
		
	}

}
