package exceptiontopic;

import java.util.Scanner;

public class TestApp3 
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
			try 
			{
				String name= null;
				System.out.println(name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				
				ans = no1/no2;
			} catch (Exception e) 
			{
				ans = 0;
				e.printStackTrace();
			}

			try 
			{
				
				int a[] = new int[5];
				a[5] = 10;
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}catch (Exception e) 
		{
			e.printStackTrace();
			ans = 0;
			System.out.println("Exception---catch Block Handled Exception");
		}
		System.out.println("Result : " + ans);
	}
}
