import java.util.*;
class StudentDemo
{
	public static void main(String args[])
	{
		
		Student obj = new Student();
		obj.setName("John");
		obj.setRoll(21);
		System.out.println("Name is : "+obj.getName());
		System.out.println("Roll no is : "+obj.getRoll());	
	}
}

class Student
{
	String name;
	int roll_no;
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setRoll(int r)
	{
		roll_no = r;
	}
	
	public int getRoll()
	{
		return roll_no;
	}

	public String getName()
	{
		return name;
	}

}