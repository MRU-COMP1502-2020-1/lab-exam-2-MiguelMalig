package lsystems;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	ArrayList<Character> list;
	public LLine (char[] start, Set<LRule> rules) 
	{
		this.rules = rules;
		this.line = start;
		list = new ArrayList<Character>();
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException 
	{
		
		
		if(line.length == 0)
		{
			throw new LSystemSymbolException();
		}
		list.clear();
		for (int i = 0; i< line.length; i++)
		{
			for (LRule rule: rules)
			{
				if (rule.getMatch() == line[i])
				{
					for(char c: rule.getBody())
					{
						list.add(c);
					}
				}
			}
		}
		line = listToArray(list); 
	}
	
	private char[] listToArray(List<Character> list) 
	{
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) 
		{
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
