package basic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter no2 : ");
		int no2 = sc.nextInt();
		
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For Addition :");
		System.out.println("1) For Addition :");
		System.out.println("1) For Addition :");
		System.out.println("1) For Addition :");
		int choice  = sc.nextInt();
		int ans =  0 ;

		switch (choice) 
		{
			case 1: ans = no1+no2;
					System.out.println("Addition : " + ans);
					break;
			default:
				break;
		}
	}
}
