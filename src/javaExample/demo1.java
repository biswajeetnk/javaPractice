package javaExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class demo1 {

	public static void main(String[] args) {
		/*String str="Biswajeet";
				char[] arr=str.toCharArray();
				for(int i=arr.length-1; i>=0; i--)
					System.out.print(arr[i]);*/
		int[] arr= {10,100,50};
		int temp[]=new int[1];
		int k=0;
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=0; i<arr.length-1; j++)
			{
				if(arr[i]<arr[j])
				{
					temp[k]=arr[i];
				}
			}
			System.out.println(temp[k]);
		}
		/*ArrayList<Integer> hs=new ArrayList<Integer>();
		for(int i:arr)
		{
			hs.add(i);
		}
		System.out.println(hs);
		System.out.println(  hs.size()-1);*/

	}

}
