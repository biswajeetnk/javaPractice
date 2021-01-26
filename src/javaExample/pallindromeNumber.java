package javaExample;

public class pallindromeNumber
{
	public static void main(String[] args)
	{
		int number=121412;
		int tmp=number;
		int rem;
		int sum=0;
		while(number != 0)
		{
			rem = number % 10;
			sum = (sum*10) + rem;
			number = number/10;
		}
		
		System.out.println("The number after reverse : "+sum);
		if(sum == tmp)
			System.out.println("The number is pallindrome");
		else
			System.out.println("The number is not pallindrome");
	}
}
