//input : Biswajeet
//output : e=2

package javaExample;

public class practice5 
{
	public static void main(String[] args)
	{
		String str = "Biswajeet Nayak";
		//String str2 = str.toLowerCase();
		char character = 'a';
		int count=0;
		char[] arrayOfCharacters = str.toCharArray();
		for(int i=0; i<arrayOfCharacters.length; i++)
		{
			if(character == arrayOfCharacters[i])
			{
				//System.out.println("true");
				count++;
			}
		}
		
		System.out.println(count);
	}
}
