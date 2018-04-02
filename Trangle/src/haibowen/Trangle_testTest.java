package haibowen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Trangle_testTest {
	private  static Trangle_test tra=new Trangle_test();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test0() {
		//fail("Not yet implemented");
		tra.triangle(-1,2,3);
		assertEquals(0, tra.getReuslt());
		
		
	}
	@Test
	public void test1() {
		tra.triangle(6, 6, 6);
		
		assertEquals(1, tra.getReuslt());
		
	}
	@Test
	public void test2() {  //错的
		tra.triangle(9, 5, 5);
		
		assertEquals(3, tra.getReuslt());
		
	}
	@Test
	public void test3() {
		tra.triangle(3, 3, 4);
		assertEquals(3,tra.getReuslt());
	}
	@Test
	public void test4() {//错的
		tra.triangle(3, 4, 5);
		assertEquals(7, tra.getReuslt());
	}
	
	@Test
	public void test5() {
		tra.triangle(2, 3, 4);
		assertEquals(5,tra.getReuslt());
	}
	@Test
	public void test6() {//错的
		tra.triangle(-1, 3, 4);
		assertEquals(0,tra.getReuslt());
	}
	@Test
	public void test7() {
		tra.triangle(3, 4, 5);
		assertEquals(7,tra.getReuslt());
	}
	@Test
	public void test8() {// 错的
		tra.triangle(6, 5, 7);
		assertEquals(5,tra.getReuslt());
	}
	@Test
	public void test9() {
		tra.triangle(1, 5, 7);
		assertEquals(0,tra.getReuslt());
	}



}
