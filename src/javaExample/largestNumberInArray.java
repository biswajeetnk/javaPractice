package javaExample;

public class largestNumberInArray
{
	public static void main(String[] args)
	{
		int[] numberArray = {1,7,10,34,7,2};
		int max = numberArray[0];
		for(int i=0; i<numberArray.length; i++)
		{
			if(numberArray[i] > max)
				max = numberArray[i];
		}
		System.out.println("The largest number in the array is : "+max);
	}
}
