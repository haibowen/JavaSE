package com.haibowen;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class trangleTypeTest {
	trangleType a=new trangleType();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		a.trangle(1,1,1);
		assertEquals(1, a.getResult());
		
		}

	@Test
	public void test1() {
		byte d = 0;
		//fail("Not yet implemented");
		a.trangle1(d,d,d);
		assertEquals(1, a.getResult1());
		
		}

}
