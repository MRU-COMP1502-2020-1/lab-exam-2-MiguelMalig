package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_BCTest {

	@Test
	public void testGetMatch() 
	{
		A_BC a = new A_BC();
		assertEquals("GetMatchTest", 'A', a.getMatch() );
	}
}
