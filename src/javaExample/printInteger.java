//print integers entered by user

package javaExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class printInteger
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter the number : ");
		int number = sc.nextInt();
		System.out.println("The number entered by user is : "+number);*/
		int length = 5;
		for(int i=0; i<=length; i++)
		{
			System.out.println("Enter the number : ");
			int number = sc.nextInt();
			System.out.println("The number entered by user is : "+number);
		}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		System.out.println(str);
	}
}
