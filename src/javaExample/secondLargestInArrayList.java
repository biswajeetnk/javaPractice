package javaExample;

import java.util.ArrayList;
import java.util.Collections;

public class secondLargestInArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(85);
		al.add(50);
		al.add(1);
		al.add(10);
		Collections.sort(al);
		System.out.println(al.get(al.size()-2));
		/*for(int i=0; i<=al.size(); i++)
		{
			System.out.println(al);
		}*/
	}
}
