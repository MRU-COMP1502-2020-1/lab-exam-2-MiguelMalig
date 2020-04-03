package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_QTest {

	public void testGetMatch() 
	{
		A_Q a = new A_Q();
		assertEquals("GetMatchTest", 'A', a.getMatch() );
	}

}
