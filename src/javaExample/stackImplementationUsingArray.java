//stack implementation using array

package javaExample;

public class stackImplementationUsingArray
{
	int size;
	int arr[];
	int top;
	
	public stackImplementationUsingArray(int size)
	{
		this.size = size;
		this.arr = new int[size]; //initialise static array : int arr[] = new int[size];
		this.top = -1;
	}
	
	
	boolean isEmpty()
	{
		return (top==-1); //OR return top==-1;
	}
	
	boolean isFull()
	{
		return (top==size-1);
	}
	
	int push(int ele)
	{
		if(!isFull())
		{
			top++;
			arr[top]=ele;
			System.out.println("Pushed element is : "+ele);
		}
		
		else
		{
			System.out.println("The stack is FULL, so cannot push more elements");
		}
		
		return top;
	}
	
	int pop(int ele)
	{
		if(!isEmpty())
		{
			top--;
			System.out.println("Popped element is : "+ele);
			
		}
		
		else
		{
			System.out.println("The stack is EMPTY, so no elements to remove");
		}
		
		return ele;
	}
	
	int peek()
	{
		if(!isEmpty())
		{
			return arr[top];
		}
		
		else
		{
			System.out.println("The stack is EMPTY, no elements to display");
			return -1;
		}
	}
	
	public static void main(String[] args)
	{
		stackImplementationUsingArray stackArray = new stackImplementationUsingArray(4);
		stackArray.pop(100);
		stackArray.peek();
		stackArray.push(100);
		stackArray.push(200);
		stackArray.push(300);
		stackArray.push(400);
		stackArray.push(500);
		System.out.println("The top element is : "+stackArray.peek());
		stackArray.pop(400);
		System.out.println("The top element is : "+stackArray.peek());
	}
}
