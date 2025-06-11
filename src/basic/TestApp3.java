package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NO1 : ");
//		int no = new Scanner(System.in).nextInt();
		int no1 = sc.nextInt();

		System.out.println("Enter NO2 : ");
		int no2 = sc.nextInt();
		System.out.println("Enter NO3 : ");
		int no3 = sc.nextInt();
		
		if (no1 > no2) 
		{
			if(no1 > no3) 
			{
				System.out.println("No1 is Max : " + no1);
			}else 
			{
				System.out.println("No3 is Max : " + no3);
			}
		} else {
			if(no2 > no3) 
			{
				System.out.println("No2 is Max : " + no2);
			}else 
			{
				System.out.println("No3 is Max : " + no3);
			}
		}
//		if(no > 0) 
//		{	
//			System.out.println("No is Positive : " + no);
//		}
//		else if(no < 0)
//		{	 
//			System.out.println("No is Negative : " + no);
//		}else 
//		{
//			System.out.println("No is Zero : " + no);
//		}
//		System.out.println("General Statements");
	}
}

