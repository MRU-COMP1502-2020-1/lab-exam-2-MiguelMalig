package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_ATest {

	@Test
	public void testGetMatch() 
	{
		A_A a = new A_A();
		assertEquals("GetMatchTest", 'A', a.getMatch() );
	}
	@Test
	public void testGetBody() 
	{
		A_A a = new A_A();
		assertEquals('A', a.getBody());
	}

}
