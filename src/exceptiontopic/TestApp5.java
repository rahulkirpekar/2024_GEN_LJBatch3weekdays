package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp5 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception--Checked[CompileTime]
			throw new InvalidAgeException("\n\"Invalid Age Exception,\n\tPlease enter Valid Age for Vote.\"");
			
			// Unchecked Exception
//			throw new ArithmeticException("\nInvalid Age Exception,\n\tPlease enter Valid Age for Vote.");
			
		} else 
		{
			System.out.println("Welcome For Vote");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			System.out.println("Catch Block Handled Exception");
			e.printStackTrace();
		}
		System.out.println("Affter catch Block -- general Statement");
	}
}
