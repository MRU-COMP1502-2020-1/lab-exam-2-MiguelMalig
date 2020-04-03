package lsystems;

public class A_B extends LRule
{
	private char match;
	private char[] body = {'B'};
	
	public A_B()
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
