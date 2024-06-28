import java.lang.*;
import java.util.*;
class Rectangle
{
	protected double length;
	protected double breadth;
	public Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
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
class Cuboid extends Rectangle
{
	private double height;
	public Cuboid(double length,double breadth,double height)
	{
		super(length,breadth);
		this.height = height;
	}
	public double totalSurfaceArea()
	{
		return 2*(length*breadth + length*height + breadth*height);
	}
	public double volume()
	{
		return length*breadth*height;
	}
}
class M3
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(4,5);
		System.out.println("Rectangle Area: " + r.area());
		Cuboid c = new Cuboid(4,5,6);
		System.out.println("Cuboid area: "+ c.totalSurfaceArea());
		System.out.println("Cuboid volume: "+c.volume());
		
	}
}