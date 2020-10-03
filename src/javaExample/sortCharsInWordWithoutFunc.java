package javaExample;

public class sortCharsInWordWithoutFunc
{
	public static void main(String[] args)
	{
		String word = "Biswajeet";
		String lowercase=word.toLowerCase();
		char[] charArr=lowercase.toCharArray();
		for(int i=0; i<charArr.length; i++)
		{
			//System.out.println("Word in array : "+charArr[i]);
			//int ascii=(int)charArr[i];
			//System.out.println(ascii);
			for(int j=i+1; j<charArr.length; j++)
			{
				char temp=0;
				if(charArr[i]>charArr[j])
				{
					temp=charArr[i];
					charArr[i]=charArr[j];
					charArr[j]=temp;
				}
			}
			System.out.println(charArr[i]);
		}
	}
}
