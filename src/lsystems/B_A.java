package lsystems;

public class B_A extends LRule
{
	private char match;
	private char[] body = {'A'};
	
	public B_A()
	{
		match = 'B';
		
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