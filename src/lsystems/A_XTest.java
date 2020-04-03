package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_XTest {

	@Test
	public void testGetMatch() 
	{
		A_X a = new A_X();
		assertEquals("GetMatchTest", 'A', a.getMatch() );
	}
	public void testGetBody() 
	{
		A_X a = new A_X();
		char [] list = a.getBody();
		
		assertEquals('X', list[0]);
	}

}
