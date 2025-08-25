package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans;
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
				
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		
		try 
		{
			String name= null;
			System.out.println(name.length());

			ans = no1/no2;
		
			int a[] = new int[5];
			a[5] = 10;
			
		}catch(NullPointerException e) 
		{
			e.printStackTrace();
			ans = 0;
			System.out.println("NullPointerException---catch Block Handled Exception");
		}catch(ArithmeticException e) 
		{
			e.printStackTrace();
			ans = 0;
			System.out.println("ArithmeticException---catch Block Handled Exception");
		}catch (Exception e) 
		{
			e.printStackTrace();
			ans = 0;
			System.out.println("Exception---catch Block Handled Exception");
		}
		System.out.println("Result : " + ans);
	}
}
