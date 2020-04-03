package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ABTest {

	@Test
	public void testGetMatch() 
	{
		A_B a = new A_B();
		assertEquals("GetMatchTest", 'A', a.getMatch() );
	}
	
	
}
