package javaExample;

public class sortNumbers
{
	public static void main(String[] args)
	{
		int[] numberArray= {50,10,82,45,60};
		for(int i=0; i<numberArray.length; i++)
		{
			for(int j=i+1; j<numberArray.length; j++)
			{
				int temp=0;
				if(numberArray[i]>numberArray[j])
				{
					temp=numberArray[i];
					numberArray[i]=numberArray[j];
					numberArray[j]=temp;	
				}
			}
			System.out.print(numberArray[i]+" ");
		}
		
	}
}
