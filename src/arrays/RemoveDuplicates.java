package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,4,6,6,7,8,1,2));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(list);
		System.out.println(lhs);
	}
}
