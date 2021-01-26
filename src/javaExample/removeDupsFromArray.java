//input = 10,10,10,20,30,30
//output = 10,20,30

package javaExample;

import java.util.HashMap;
import java.util.Map;

public class removeDupsFromArray
{
	public static void main(String[] args)
	{
		int[] arrayOfNumbers = {10,10,10,20,30,30};
		Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		for(int n : arrayOfNumbers)
		{
			if(numbers.containsKey(n))
			{
				numbers.put(n, numbers.get(n)+1);
			}
			
			else
			{
				numbers.put(n, 1);
			}
		}
		System.out.println(numbers.entrySet());
		System.out.println(numbers.keySet());
		System.out.println("size : "+numbers.size());
	}
}
