import java.lang.*;
import java.util.*;
class Super
{
	public void display()
	{
		System.out.println("Super class!");
	}
	
}
class Sub extends Super
{
	public void display()
	{
		System.out.println("Sub class !");
	}
}
class M4
{
	public static void main(String args[])
	{
		// Demonstration of Method overriding
		Super obj1  = new Super();
		obj1.display();
		Sub obj2 = new Sub();
		obj2.display();
	}
}