//Java doesn't allow multiple inheritance using class
//But multiple inheritance can be achieved using interface

class parent 
{
	void show()
	{
		System.out.println("parent class show");
	}
}


interface I1
{
	public void display();
}

interface I2
{
	public int display();
}

public class multipleInheritanceDemo extends parent implements I1, I2
{
	void show()
	{
		System.out.println("child class show");
	}

	@Override
	public void display()
	{
		//return 1;
		System.out.println("Interface display");
	}
	
	@Override
	public int display()
	{
		return 1;
		//System.out.println("Interface display");
	}
	
	public static void main(String[] args)
	{
		multipleInheritanceDemo mid = new multipleInheritanceDemo();
		mid.show();
		mid.display();
		mid.display();
	}
}
