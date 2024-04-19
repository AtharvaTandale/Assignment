import java.util.*;
class AreaDemo2
{
	public static void main(String args[])
	{
		
		Triangle1 obj = new Triangle1(3,4,5);
		System.out.println("Area is : "+obj.getArea());	
		System.out.println("Perimeter is : "+obj.getPeri());
	}
}

class Triangle1
{
	int area;
	int peri;
	
	public Triangle1(int s1,int s2,int s3)
	{
		area=s1*s2*s3;
		peri=s1+s2+s3;
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