package javaExample;

public class aplhabetOrNot
{
	public static void main(String[] args)
	{
		char ch='Y';
		int ascii=ch;
		System.out.println("ASCII value of '"+ch+"' is "+ascii);
		if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122)
			System.out.println("It's an alphabet");
		
		else
			System.out.println("Not an alphabet");
	}
}
