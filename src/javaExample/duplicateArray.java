package javaExample;

public class duplicateArray
{
	public static void main(String[] args)
	{
		int[] arr1 = {10,5,10,4,20};
		int[] tmp = new int[arr1.length];
		//System.out.println(tmp.length);
		int pos=0;
		for(int i=0; i<arr1.length; i++)
		{
			//System.out.println("i = "+arr1[i]);
			for(int j=i+1; j<arr1.length; j++)
			{
				//System.out.println("j = "+arr1[j]);
				if(arr1[i]!=arr1[j])
				{
					tmp[pos]=arr1[j];
					System.out.println("tmp = "+tmp[pos]);
				}
			}
			
			//System.out.println(tmp[pos++]);
		}
		
		/*for(int i=0; i<tmp.length-1; i++)
		{
			System.out.println(tmp[pos++]);
		}*/
	}
}
