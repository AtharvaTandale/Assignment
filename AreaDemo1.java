import java.util.*;
class AreaDemo1
{
	public static void main(String args[])
	{
		
		Triangle obj = new Triangle();
		System.out.println("Area is : "+obj.getArea());	
		System.out.println("Perimeter is : "+obj.getPeri());
	}
}

class Triangle
{
	int area;
	int peri;
	
	public Triangle()
	{
		area=3*4*5;
		peri=3+4+5;
	}
	
	public int getArea()
	{
		return area;
	}
	
	public int getPeri()
	{
		return peri;
	}
}