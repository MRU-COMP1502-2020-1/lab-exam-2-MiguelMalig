package lsystems;

public class LSystemSymbolException extends Exception
{
	char c;
	public LSystemSymbolException(char c)
	{
		this.c = c;
	}
	
	public char getSymbol()
	{
		return c;
	}
}
