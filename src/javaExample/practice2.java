//Calculate occurences of words in a give statement
//input : Biswa is going to his hometown and is ready to leave
//output : is=2

package javaExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class practice2
{
	public static void main(String[] args)
	{
		//1-scenario
		/*String statement = "Biswa is going to his hometown and is ready to leave";
		String[] statementArray = statement.split(" ");
		
		Map<String, Integer> wordsInStatement = new HashMap<String, Integer>();
		for(String word : statementArray)
		{
			if(wordsInStatement.containsKey(word))
			{
				wordsInStatement.put(word, wordsInStatement.get(word)+1);
			}
			
			else
			{
				wordsInStatement.put(word, 1);
			}
		}
		
		System.out.println(wordsInStatement.entrySet());*/
		
		//2-scenario
		String statement = "Biswa is going to his hometown and is ready to leave leave leave";
		String word = "Leave";
		int count = 0;
		String statementArray[] = statement.split(" ");
		
		for(String words : statementArray)
		{
			if(words.equalsIgnoreCase(word))
			{
				//System.out.println("It is there");
				count++;
			}
		}
		System.out.println("The word '"+word+"' in the statement occurs : "+count+" time/s");
		//System.out.println("Word count is : "+wordInStatement.entrySet());
		
		
		
	}	
}
