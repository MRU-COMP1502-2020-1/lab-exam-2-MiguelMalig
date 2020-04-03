package lsystems;

public class C_B extends LRule
{
	private char match;
	private char[] body = {'B'};
	
	public C_B()
	{
		match = 'C';
		
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