import java.util.*;
class AreaDemo3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Area3 obj = new Area3(l,b);
		System.out.println("Area is : "+obj.getArea());	
	}
}

class Area3
{
	int area;
	
	public Area3(int l,int b)
	{
		area=l*b;
	}
	
	public int getArea()
	{
		return area;
	}

}