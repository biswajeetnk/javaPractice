package arrays;

import java.util.Arrays;

public class RemoveElement
{
	public static void main(String[] args)
	{
		int[] arr1 = {3,8,9,10,5};
		int[] arr2 = new int[arr1.length-1];
		int elementToBeRemoved = 5;
		int i, j=0;
		for(i=0; i<arr1.length; i++)
		{
			if(arr1[i] == elementToBeRemoved)
			{
				continue;
				
			}
			//arr1[arr1.length-1]=0;
			arr2[j++]=arr1[i];
			
		}
		System.out.println(Arrays.toString(arr2));
	}
}
