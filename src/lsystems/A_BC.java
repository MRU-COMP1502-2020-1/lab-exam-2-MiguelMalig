package lsystems;

public class A_BC extends LRule
{
	private char match;
	private char[] body = {'B','C'};
	
	public A_BC()
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