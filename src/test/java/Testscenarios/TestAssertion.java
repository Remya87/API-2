package Testscenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertion {

	
	@Test
	public void demo()
	{
	Assert.assertEquals(1, 1);
	Assert.assertEquals("abc", "abc");
	Assert.assertEquals(9f,9f);
	Assert.assertEquals(1.5, 1.5);
	Assert.assertEquals(true, true);
	
	Assert.assertTrue(false,"assertion failed");
	
	
	Assert.assertEquals(1, 2,"assetion failed");
	Assert.assertEquals("abc", "abcd");
	Assert.assertEquals(9f,10f);
	Assert.assertEquals(1.5, 2.5);
	Assert.assertEquals(true, true);
	
	
	}
	
	
}
