
package javaExample;

public class stackImplementationUsingLinkedList
{
	Node head;

	class Node
	{
		int value;
		Node next;
	}

	stackImplementationUsingLinkedList()
	{
		head=null;
	}

	void push(int element)
	{
		Node previousNode = head;
		head=new Node();
		head.value = element;
		head.next = previousNode;
		//head=newNode;
		//System.out.println("The pushed element : "+head.value);
		//System.out.println("The address value : "+head.next);
		//System.out.println(head);
	}

	int pop()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
		}
		int value = head.value;
		head = head.next;
		
		return value;
	}
	
	void display()
	{
		while(head == null)
		{
			System.out.println(head.value);
			//head.next;
		}
	}

	public static void main(String[] args)
	{
		stackImplementationUsingLinkedList stackLL = new stackImplementationUsingLinkedList();
		stackLL.push(10);
		stackLL.push(20);
		stackLL.push(30);
		stackLL.push(40);
		stackLL.display();
		System.out.println(stackLL.pop());

	}
}
