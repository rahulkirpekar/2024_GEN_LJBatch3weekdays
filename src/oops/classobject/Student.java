package oops.classobject;

import java.util.Scanner;

// Pure Encapsulation---[Data Security]---[INCREASE]

// Dm' ---private
// Mf'----public

// private--Within class
public class Student 
{
	// 1. Data Members===>Data
	private int rno,std;
	private String name;
	
	// 2. Member Function--Optional
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
}