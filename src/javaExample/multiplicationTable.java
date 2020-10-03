package javaExample;

import java.util.Scanner;

public class multiplicationTable
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want the multiplication table : ");
		int multiplicand=sc.nextInt();
		System.out.println("Enter the multiplier the you want : ");
		int multiplier=sc.nextInt();
		int product = 1;
		for(int i=0; i<=multiplier; i++)
		{
			System.out.println(multiplicand+" * "+i+" = "+multiplicand*i);
		}
		
	}
	
}
