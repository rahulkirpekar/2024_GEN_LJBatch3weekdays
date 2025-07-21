package oops.finaltopic.dmtopic;

public class Student 
{
	int rno;
	String name;
	int std;
	
	final String schoolName ;//= "DPS";
	
	public Student() 
	{
		schoolName = "DPS";
	}

	public Student(String schoolName) 
	{
		this.schoolName = schoolName;
	}

	

	public static void main(String[] args) 
	{
		Student s1 = new Student("XYZ");
		
		System.out.println(s1.schoolName);
	}
}
