import java.util.*;
class StudentDemo1
{
	public static void main(String args[])
	{
		
		Student1 obj = new Student1();
		obj.setName("John");
		obj.setRoll(21);
		obj.setAdd("Mumbai");
		System.out.println("Name is : "+obj.getName());
		System.out.println("Roll no is : "+obj.getRoll());
		System.out.println("Address is : "+obj.getAdd());

		obj.setName("Sam");
		obj.setRoll(22);
		obj.setAdd("Pune");
		System.out.println("Name is : "+obj.getName());
		System.out.println("Roll no is : "+obj.getRoll());
		System.out.println("Address is : "+obj.getAdd());	
	}
}

class Student1
{
	String name;
	int roll_no;
	String address;
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setRoll(int r)
	{
		roll_no = r;
	}

	public void setAdd(String a)
	{
		address = a;
	}
	
	public int getRoll()
	{
		return roll_no;
	}

	public String getName()
	{
		return name;
	}

	public String getAdd()
	{
		return address;
	}

}