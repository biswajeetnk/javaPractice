package javaExample;

import java.util.Stack;

public class pallindromeWord
{
	public static void main(String[] args) 
	{ 
		/*String str = "yayay";

		//1st - approach :
		int i=0;
		int j=str.length()-1;
		int flag=1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=0;
				break;
			}
			i++;
			j--;
			flag=1;
		}

		if(flag==1)
			System.out.println("It's pallindrome");

		else
			System.out.println("Not pallindrome");*/

		//2nd - approach using Stack :
		String str = "biswa";
		String reverse = "";

		Stack s = new Stack();
		for(int i=0; i<=str.length()-1; i++)
		{
			s.push(str.charAt(i));
		}

		while(!s.isEmpty())
		{
			reverse = reverse + s.pop();
		}

		if(str.equals(reverse))
			System.out.println("It's pallindrome");
		else
			System.out.println("It's not pallindrome");
	}

}
