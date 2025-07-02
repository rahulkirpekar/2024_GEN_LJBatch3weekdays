package oops.constructortopic;

import java.util.Scanner;

public class Student 
{
	private int rno,std;
	private String name;
	
	// 1. User Defined---Default
	
	public Student() 
	{
		System.out.println("START : Default Constructor");
		dispData();
		
		rno=1;
		name="Rahul Kirpekar";
		std=12;		
		
		dispData();
		System.out.println("EXIT : Default Constructor");
	}
	// 2. Para
	
	public Student(int rno,String name,int std) 
	{
		this.rno = rno;
		this.name =name;
		this.std = std;
	}
	
	// 3. copy
	public Student(Student s) 
	{
		this.rno  = s.rno;
		this.name = s.name;
		this.std  = s.std;
	}
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Rno : "); 
		rno  = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : "); 
		name = sc.nextLine();
		System.out.println("Enter Std : "); 
		std  = sc.nextInt();
	} 
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
	public static void main(String[] args) 
	{
		Student s1= new Student(1,"Krunal",12);
		
		Student s2= new Student(s1);
		
		s1.dispData();
		s2.dispData();
	}
}