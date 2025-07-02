package oops.classobject;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Student--reference Type
		// obj--reference variable
		// new --KeyWord--[JVM]--[create Object]
		// Student---object
		// Student()--Constructor
		Student obj1 = new Student();//obj1-[rno name std]
		Student obj2 = new Student();//obj2-[rno name std]
		Student obj3 = new Student();//obj3-[rno name std]

		obj1.scanData(); 
		obj2.scanData(); 
		obj3.scanData(); 
		
		obj1.dispData();
		obj2.dispData();
		obj3.dispData();
	}
}