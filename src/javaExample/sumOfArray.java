package javaExample;

import java.util.Arrays;

class sumOfArray
{
	static int indexOfTheElement(int[] arr, int number)
	{
		int index=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i] == number)
			{
				index=i;
			}
		}
		
		return index;
	}
	
	public static void main(String[] args)
	{
		int[]  arr1= {1,6,5,8,10,4,9,12,18};
		int i=0;
		
		int start = indexOfTheElement(arr1, 6);
		int end = indexOfTheElement(arr1, 9);
		
		System.out.println("Index of first element : "+start);
		System.out.println("Index of second element : "+end);
		
		int[] arr2=Arrays.copyOfRange(arr1, start, end+1);
		
		for(i=0; i<=arr2.length-1; i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
