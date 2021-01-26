package javaExample;

public class duplicatesInArray
{
	public static void main(String[] args)
	{
		int[] arr1 = {2,5,6,7};
		int[] arr2 = {7,8,2,4};
		int[] arr3= new int[8];
		int k=0;
		
		for(int ele : arr1)
		{
			arr3[k++]=ele;
		}
		
		for(int ele : arr2)
		{
			arr3[k++]=ele;
		}
		
		/*for(k=0; k<arr3.length; k++)
		{
			System.out.print(arr3[k]+",");
		}*/
		
		for(int i=0; i<arr3.length; i++)
		{
			for(int j=i+1; j<arr3.length; j++)
			{
				if(arr3[i] == arr3[j])
				{
					System.out.print(arr3[i]+",");
				}
			}
		}
	}
}
