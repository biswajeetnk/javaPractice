package javaExample;

import java.util.Scanner;

public class primeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int flag=0;
		int m = n/2;
		for(int i=2; i<=m; i++) 
		{
			if(n%i == 0)
			{
				System.out.println("It is NOT prime number");
				flag=1;
				break;
			}
		}
			
		if(flag==0)
		{
			System.out.println(n+" is Prime Number ");
		}
	}
}
