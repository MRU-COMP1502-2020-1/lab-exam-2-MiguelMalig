package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_QTest {

	public void testGetMatch() 
	{
		A_Q a = new A_Q();
		assertEquals("GetMatchTest", 'A', a.getMatch() );
	}
	public void testGetBody() 
	{
		A_Q a = new A_Q();
		char [] list = a.getBody();
		
		assertEquals('A', list[0]);
	}

}
