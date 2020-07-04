package javaExample;

public class swapWithout3Variable
{
	public static void main(String[] args)
	{
		/*This is for integer*/
		int a=500;
		int b=10;
		
		System.out.println("Before swapping, 'a' value is : "+a);
		System.out.println("Before swapping, 'b' value is : "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping, 'a' value is : "+a);
		System.out.println("After swapping, 'b' value is : "+b);
		
		/* for strings*/
		String str1="Biswa";
		String str2="Nayak";
		System.out.println("Before swapping 'str1' value is : "+str1);
		System.out.println("Before swapping 'str2' value is : "+str2);
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("After swapping 'str1' value is : "+str1);
		System.out.println("Before swapping 'str2' value is : "+str2);
		
	}
}
