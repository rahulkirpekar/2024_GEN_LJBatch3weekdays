package exceptiontopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String value = "1a2b3";
		System.out.println(Integer.parseInt(value));// NumberFormateException
		
		
//		A objA = new B();
//		C objC = (C)objA;// ClassCastException
		
		
//		String name = "Royal";
//		System.out.println(name.charAt(5));// StringIndexoutofBoundException
		
//		int a[] = new int[5];// a[0],...a[4]
//		a[5] = 10;// ArrayIndexoutofBoundException

//		String name = null;
//		System.out.println(name.length());// NullPointerException
		
		
/*		
		Scanner sc = new Scanner(System.in);
		int no1,no2,ans;
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
				
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		
		ans = no1/no2;
		
		System.out.println("Result : "+ans);
		Exception:- Abnormal Scenario.
		-----------

		1.ArithmeticException:-
		------------------------
			10 / 0; // ArithmeticException


		2. NullpointerException:-
		--------------------------
			String name = null;
			SOP(name.length());// NullPointerException

		3. ArrayIndeexoutofBoundException:-
		------------------------------------
			int a[] = new int[5];// a[0],...a[4]
			a[5] = 10;// ArrayIndexoutofBoundException

		4. StringIndexoutofBoundException:-
		------------------------------------
				 //    01234
			String name = "Royal";
			SOP(name.charAt(5));// StringIndexoutofBoundException

		5. ClassCastException:-
		--------------------------
					A
					|
				-----------------
				|		|
				B		C	

			A obj = new B();
			
			C objC = (C)obj; // ClassCastException

		6. NumberFormateException:-
		------------------------------

			String value = "1a2b3";
			SOP(Integer.parseInt(value));// NumberFormateException
*/













		
	}
}
