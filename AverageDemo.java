import java.util.*;
class AverageDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		Average obj = new Average();
		obj.setAverage(n1,n2,n3);
		System.out.println("Average is : "+obj.getAverage());	
	}
}

class Average
{
	int average;
	
	public void setAverage(int n1,int n2,int n3)
	{
		average=(n1+n2+n3)/3;
	}
	
	public int getAverage()
	{
		return average;
	}

}