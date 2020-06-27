package javaExample;

public class swapUsing3Variable
{
	public static void main(String[] args)
	{
		//for integers
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Before swapping 'a' value is : "+a);
		System.out.println("Before swapping 'b' value is : "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping 'a' value is : "+a);
		System.out.println("After swapping 'b' value is : "+b);
		System.out.println("------------------------------------");
		
		//for strings
		String str1="Biswa";
		String str2="Nayak";
		String strTemp;
		System.out.println("Before swapping 'str1' is : "+str1);
		System.out.println("Before swapping 'str2' is : "+str2);
		strTemp=str1;
		str1=str2;
		str2=strTemp;
		System.out.println("After swapping 'str1' is : "+str1);
		System.out.println("After swapping 'str2' is : "+str2);
	}
}
