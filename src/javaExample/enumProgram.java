package javaExample;

enum programs
{
	Java,
	JavaScript,
	Python,
	Go,
	CPP,
	
}

public class enumProgram
{
	public static void main(String[] args)
	{
		programs pro = programs.JavaScript;
		
		System.out.println("Print the program name : "+pro);
		System.out.println("---------------------------------");
		
		//ENUM using SWITCH
		System.out.println("ENUM using switch :");
		switch(pro)
		{
		case Java :
			System.out.println("This is Java");
			break;
		case JavaScript :
			System.out.println("This is JavaScript");
			break;
		case Python :
			System.out.println("This is Python");
			break;
		case Go :
			System.out.println("This is Go");
			break;
		case CPP :
			System.out.println("This is CPP");
			break;
		}
		System.out.println("----------------------------------");
		
		//iterating in ENUM
		for(programs programList : pro.values())
		{
			System.out.println("Print program list : "+programList);
		}
		System.out.println("----------------------------------");
		
		//Lookup ENUM by String value :
		String lookUpValue = "Java";
		System.out.println("The lookup value is : "+pro.valueOf(lookUpValue));
	}
}
