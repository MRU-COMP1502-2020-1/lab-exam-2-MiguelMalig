package lsystems;

public class LSystemLengthException extends Exception
{
	public LSystemLengthException(String message)
	{
		super(message);
		
	}
	
	public String getSymbol()
	{
		return "Complete";
	}
}
