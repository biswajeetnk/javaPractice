package javaExample;

public class vowelOrConsonant
{
	public static void main(String[] args) 
	{


		char alphabet = 'z';
		if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u' || 
				alphabet=='A' || alphabet=='E' || alphabet=='I' || alphabet=='O' || alphabet=='U')
		{
			System.out.println("'"+alphabet+"' is a vowel");
		}
		else
		{
			System.out.println("'"+alphabet+"' is not a vowel");
		}
	}
}
