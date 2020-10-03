package javaExample;

public class factorial
{
	public static void main(String[] args)
	{
		int factorial=1;
		int[] arr = {5,4,3,2,2};
		for(int i=0; i<arr.length; i++)
		{
			factorial=factorial*arr[i];
		}
		
		System.out.println("Factorial is = "+factorial);
	}
}
