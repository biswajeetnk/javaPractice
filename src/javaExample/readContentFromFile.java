package javaExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readContentFromFile
{
	public static void main(String[] args) throws IOException
	{
		FileReader file = new FileReader("D:\\demoFile.txt");
		BufferedReader br = new BufferedReader(file);
		//Map<Integer,String> hm = new HashMap<Integer, String>();
		String s = null;
		int wc=0;
		try
		{
			while((s=br.readLine()) != null)
			
			{
				//String data = sc.nextLine();
				//System.out.println(data);
				String[] words = s.split(" ");
				wc = wc+words.length;
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(wc);
		
	}
}
