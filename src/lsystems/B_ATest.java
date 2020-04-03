package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class B_ATest {

	@Test
	public void testGetMatch() 
	{
		B_A a = new B_A();
		assertEquals("GetMatchTest", 'B', a.getMatch() );
	}


}
