
public class mainClass
{
	public static void main(String[] args)
	{
		childClass cc = new childClass();
		//Here ref-variable and object is of child class
		//Hence can access parent and child class methods
		cc.display();
		//cc.childShow();
		//cc.parentShow();

		baseClass bc = new childClass(); 	//reference variable depends on the object we are creating. Here we are creating 
		//object of child class although we are creating parent class ref-variable.
		//Hence child class object is able to access parent class methods
		bc.display();
		//bc.childShow(); -> ERROR : Create a method childShow() in baseClass
		//bc.parentShow();


		/*baseClass bc2 = new baseClass();
		//Here ref-variable and object is of parent class hence it can ACCESS ONLY parent class methods
		//Cannot access child class methods
		//bc2.display();
		bc2.parentShow();
		//bc.childShow(); -> ERROR : cannot access child class method
*/	}
}
