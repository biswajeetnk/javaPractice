package javaExample;

public class reverseStringWithoutSplChars
{
	public static void reverseString(char[] ch2)
	{
		
		int r = ch2.length-1;
		int l = 0;
		while(l<r)
		{
			if(!Character.isAlphabetic(ch2[l]))
				l++;
			else if(!Character.isAlphabetic(ch2[r]))
				r--;
			else
			{
				char tmp = ch2[l];
				ch2[l] = ch2[r];
				ch2[r] = tmp;
				l++;
				r--;
			}
			//System.out.println("hi");
			//System.out.println(ch[l]);
		}
	}
	public static void main(String[] args)
	{
		String str = "Bi@#sw&a";
		char[] ch = str.toCharArray();
		System.out.println(str);
		reverseString(ch);
		//System.out.println(ch);
		String str2 = new String(ch);
		System.out.println(str2);
	}
}
