package lsystems;

public class A_AA extends LRule
{
	private char match;
	private char[] body = {'A','A'};
	
	public A_AA()
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