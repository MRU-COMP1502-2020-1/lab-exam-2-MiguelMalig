package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_AATest {
	@Test
	public void testGetMatch() 
	{
		A_AA a = new A_AA();
		assertEquals("GetMatchTest", 'A', a.getMatch() );
	}
	@Test
	public void testGetBody() 
	{
		A_AA a = new A_AA();
		assertEquals("GetMatchTest", 'AA', a.getBody() );
	}

}
