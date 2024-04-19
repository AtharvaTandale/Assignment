import java.util.*;
class ComplexDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Complex obj = new Complex();
		obj.setAdd(n1,n2);
		obj.setSub(n1,n2);
		obj.setMult(n1,n2);
		System.out.println("Addition is : "+obj.getAdd());	
		System.out.println("Substraction is : "+obj.getSub());	
		System.out.println("Multiplication is : "+obj.getMult());	
	}
}

class Complex
{
	int add;
	int sub;
	int mult;
	
	public void setAdd(int n1,int n2)
	{
		add=n1+n2;
	}
	
	public int getAdd()
	{
		return add;
	}
	
	public void setSub(int n1,int n2)
	{
		sub=n1-n2;
	}
	
	public int getSub()
	{
		return sub;
	}
	
	public void setMult(int n1,int n2)
	{
		mult=n1*n2;
	}
	
	public int getMult()
	{
		return mult;
	}

}