package lsystems;

public class A_AB extends LRule
{
	private char match;
	private char[] body = {'A','B'};
	
	public A_AB()
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
