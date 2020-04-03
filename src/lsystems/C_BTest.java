package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class C_BTest {

	@Test
	public void testGetMatch() 
	{
		C_B a = new C_B();
		assertEquals("GetMatchTest", 'C', a.getMatch() );
	}


}
