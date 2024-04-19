import java.util.*;
class AreaDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		int l = sc.nextInt();
		int b = sc.nextInt();
		Area obj = new Area();
		obj.setDim(l,b);
		System.out.println("Area is : "+obj.getArea());	
	}
}

class Area
{
	int area;
	
	public void setDim(int l,int b)
	{
		area=l*b;
	}
	
	public int getArea()
	{
		return area;
	}

}

