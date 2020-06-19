//swap the word

package javaExample;

import java.util.Scanner;

public class practice3
{
	public static void main(String[] args)
	{
		//1 - scenario : using 3rd variable
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings : ");
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
		System.out.println("String before swap is : "+firstString+" "+secondString);
		String temp;
		
		temp = firstString;
		firstString = secondString;
		secondString = temp;
		
		System.out.println("String after swap is : "+firstString+" "+secondString);*/
		
		//2 - scenario : without using 3rd variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings : ");
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
		System.out.println("String before swap is : "+firstString+" "+secondString);
		
		firstString = firstString+secondString;
		secondString = firstString.substring(0, firstString.length()-secondString.length());
		//System.out.println("second string is : "+secondString);
		firstString = firstString.substring(secondString.length());
		//System.out.println("first string is : "+firstString);
		System.out.println("String after swap is : "+firstString+" "+secondString);
	}
}
