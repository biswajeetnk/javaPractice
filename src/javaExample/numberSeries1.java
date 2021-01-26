//Question - 1 : Number series :
//Input n=3, output : 3,10,5,16,8,4,2,1
//Explaination : If number 'n' is even then next # should be 'n/2',
// If number 'n' is odd then next # should 'n*3+1'

//Question - 2 : # of Distinct values :
//Input1 n=5 inpupt2 = 2,2,5,4,7,2
//Output = 3

package javaExample;

import java.util.HashMap;
import java.util.Map;

public class numberSeries1
{
	/*public static void main(String[] args)
	{
		int n = 3;
		//int i;
		System.out.print(" "+n);
		while(n!=1)
		{
			if(n%2 == 0)
			{
				//System.out.println("Its even");
				n=n/2;
			}
			
			else
			{
				//System.out.println("Its odd");
				n=(n*3)+1;
			}
			
			System.out.print(" "+n);
		}
	}*/
	
	public static void main(String[] args)
	{
		int arr[] = {1,1,1,4,5};
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i : arr)
		{
			if(m.containsKey(i))
			{
				m.put(i, m.get(i)+1);
			}
			
			else
			{
				m.put(i, 1);
			}
		}
		
		System.out.println(m.entrySet());
			
		
	}
}
