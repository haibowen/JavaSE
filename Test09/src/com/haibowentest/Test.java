package com.haibowentest;

public class Test {
	
	public static void main(String[] args) {
		
		Book book=new Book();
		book.setAuthor("wenhaibo");
		book.setData("2018-10-17");
		book.setName("thinking in java");
		book.setPage(800);
		book.setPrice(108.9);
		
		
		XMLType xt=new XMLType();
		String outxt=xt.famer(book);
		
		JsonType jt=new JsonType();
		String outjt=
		jt.famer(book);
		System.out.println(outjt);
		System.out.println(outxt);
		
	}

}
