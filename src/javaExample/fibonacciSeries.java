package javaExample;

import java.util.Scanner;

public class fibonacciSeries
{
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int number = sc.nextInt();
		System.out.print(a+" "+b);
		while(temp<number)
		{
			//System.out.print(a+" "+b);
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(" "+temp);
		}
	}
}
