//program to find largest among 3 numbers
package javaExample;

public class largestAmongThree 
{
	
	public static void main(String[] args)
	{
		int a=80, b=100, c=999;
		
		if(a>=b && a>=c)
		{
			System.out.println(a+" is greatest among all 3 numbers");
		}
		
		else if(b>=a && b>=c)
		{
			System.out.println(b+" is greatest among all 3 numbers");
		}
		
		else
		{
			System.out.println(c+" is greatest among all 3 numbers");
		}
	}
}
