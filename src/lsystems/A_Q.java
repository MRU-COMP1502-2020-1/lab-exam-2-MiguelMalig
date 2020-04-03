package lsystems;

public class A_Q extends LRule
{
	private char match;
	private char[] body = {'Q'};
	
	public A_Q()
	{
		match = 'A';
		
	}
	
	public char getMatch()
	{
		return match;
	}
	
	public char[] getBody()
	{
		return body;
	}
}

