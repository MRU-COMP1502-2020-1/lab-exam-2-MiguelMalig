package lsystems;

public class LSystemLengthException extends Exception
{
	private char symbol;
	public LSystemLengthException(char symbol)
	{
		this.symbol = symbol;
		
	}
	
	public char getSymbol()
	{
		return symbol;
	}
}
