package javaExample;

//remove spaces
public class removeWhiteSpacesFromString
{
	public static void main(String[] args)
	{
		String str = "This is java";
		String[] noSpace = str.split(" ");
		for(String s : noSpace)
		{
			System.out.print(s);
		}
	}
}
