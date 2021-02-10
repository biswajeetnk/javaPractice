package javaExample;

public class mergeArrays 
{
	public static void main(String[] args)
	{
		int[] array1 = {4,6,8,10,1};
		int[] array2 = {77,34,8,2};
		int[] mergedArray = new int[array1.length+array2.length];
		int i=0;
		for(int element : array1)
		{
			mergedArray[i++] = element;
		}
		
		for(int element : array2)
		{
			mergedArray[i++] = element;
		}
		
		for(int j=0; j<mergedArray.length; j++)
		{
			System.out.print(mergedArray[j]+", ");
		}
	}
}
