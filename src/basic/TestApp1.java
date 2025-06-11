package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("Enter Character : ");
		
//		char value  = new Scanner(System.in).next().charAt(0);
		
		char value  = (char)System.in.read();// R
		
		System.out.println("value  : " + value );

	}
}
