package javaExample;

public class occurenceOfChars 
{
	public static void main(String[] args)
	{
		String str="BBNHAAJ";
		char[] charArray=str.toCharArray();
		int count=1;
		for(int i=0; i<charArray.length; i++)
		{
			//System.out.println(charArray[i]);
			if(charArray[i]==charArray[i+1])
			{
				count++;
				System.out.print(charArray[i]+"="+count);
			}
			else
			{
				count=0;
				System.out.print(charArray[i]+"="+count);
			}
		}
		//System.out.println("Hi");
	}
}
