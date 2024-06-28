import java.lang.*;
import java.util.*;
class Rectangle
{
	private double length;
	private double breadth;
	public Rectangle()
	{
		length = 1;
		breadth = 1;
	}
	public Rectangle(double l,double b)
	{
		length = l;
		breadth = b;
	}
	public void setLength(double l)
	{
		if(l>0)
		{
			length = l;
		}
		else
		{
			length = 0;
		}
	}
	public void setBreadth(double b)
	{
		if(b>0)
		{
			breadth =b;
		}
		else
		{
			breadth = 0;
		}
	}
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
}
class M1
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.setLength(5);
		r1.setBreadth(6);
		System.out.println("The area of r1 is : " +r1.area());
		System.out.println("The perimeter of r1 is : " + r1.perimeter());
		Rectangle r2 = new Rectangle();
		r2.setLength(-30);
		r2.setBreadth(8);
		System.out.println("The area of r2 is: " +r2.area());
		Rectangle r3 = new Rectangle();
		System.out.println(r3.area());
		Rectangle r4 = new Rectangle(10,20);
		System.out.println(r4.area());
		
		
	}
}