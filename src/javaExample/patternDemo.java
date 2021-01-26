package javaExample;

public class patternDemo {
public static void main(String[] args) {

int count=0;
for(int i=0; i<5; i++)
{
	for(int j=0; j<=i; j++)
	{
		System.out.print(++count);
	}
	count=0;
	System.out.println();
}
}
}
