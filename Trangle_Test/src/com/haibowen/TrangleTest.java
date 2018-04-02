package com.haibowen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrangleTest {
	private Trangle tra=new Trangle();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test0() {//�߳��������0
		//fail("Not yet implemented");
		tra.trangle(0, 1, 2);
		assertEquals(0, tra.getResult());
	}
	
	@Test
	public  void test1() {//����
		tra.trangle(2, 2, 3);
		assertEquals(2, tra.getResult());
	}
	@Test
	public void test2() {//�ȱ�
		tra.trangle(2, 2, 2);
		assertEquals(3, tra.getResult());
	}
	@Test
	public void test3() {//��ͨ
		tra.trangle(2, 3, 4);
		assertEquals(4, tra.getResult());
	}
	@Test
	public void test4() {//ֱ��
		tra.trangle(3, 4, 5);
		assertEquals(5, tra.getResult());
		
	}
	@Test
	public void test5() {//Խ��
		
		tra.trangle(101, 4, 5);
		assertEquals(1, tra.getResult());
	}
	@Test
	public void test6() {
		tra.trangle(5, 5, 5);
		assertEquals(3,tra.getResult());
		
	}

}
