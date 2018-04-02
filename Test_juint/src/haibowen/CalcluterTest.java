package haibowen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcluterTest {
	private static Calcluter calculter =new Calcluter();

	@Before
	public void setUp() throws Exception {
		System.out.print("wrong!!!");
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calcluter.add(2);
		Calcluter.add(3);
		assertEquals(5,Calcluter.getResult());
		/*Calcluter.add(4);
		Calcluter.add(4);
		assertEquals(8,Calcluter.getResult());
		*/
	}
	
	@Test
	public void testSubstract() {
		Calcluter.substract(2);
		Calcluter.substract(1);
	    assertEquals(1,Calcluter.getResult());
	
		 
	 }
	 @Test
	 public void testDivide() {
		 Calcluter.divide(3);
		 Calcluter.divide(1);
		 assertEquals(3,Calcluter.getResult());
		 
	}

}
