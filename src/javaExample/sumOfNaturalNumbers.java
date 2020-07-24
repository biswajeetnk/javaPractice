package javaExample;

public class sumOfNaturalNumbers
{
	public static void main(String[] args)
	{
		
		int sum=0;
	int[] arr = {2,5,6,7,8,10};
	for(int i=0; i<arr.length; i++)
	{
		sum=sum+arr[i];
	}
	System.out.println("Sum of natural numbers : "+sum);
	}
}
