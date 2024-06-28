import java.lang.*;
import java.util.*;
class A
{
	public void method1()
	{
		System.out.println("Method 1 of super class");
	}
	public void method2()
	{
		System.out.println("Method 2 of super class");
	}
}
class B extends A
{
	public void method2()
	{
		System.out.println("Method 2 of sub class (overriden)");
	}
	public void method3()
	{
		System.out.println("Method 3 of sub class");
	}
}
class M5
{
	// Dynamic Method Dispatch (Runtime Polymorphism)
	// Dynamic Method Dispatch (Runtime Polymorphism)
	public static void main(String args[])
	{
		A obj = new B();
		obj.method1();
		obj.method2();
		//method3() cannot be accessed by super class reference
		//obj.method3();
	}
}