package lsystems;

//A-> EMPTY
public class A_X extends LRule
{
	private char match;
	private char[] body = {' '};
	
	public A_X()
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
