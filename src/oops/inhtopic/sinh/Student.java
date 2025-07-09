package oops.inhtopic.sinh;

import java.util.Scanner;
// Single Inheritance-- Child class
public class Student extends Person
{
	int rno,std,marks;
	
	public Student() 
	{
		super("Ganesh");
		System.out.println("Student : Default Constructor");
		rno=1;
		std=12;
		marks=100;
	}
	public Student(int rno,String name,int std,int marks) 
	{
		super(name);
		System.out.println("Student : Para  public Student(int rno,String name,int std,int marks) ");
		this.rno=rno;
		this.std=std;
		this.marks=marks;
	}
	void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
