package arrayytopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		
//		Array Declaration:-
//		----------------------
//			int a1[] = new int[5];

		int a[] = {1,2,3,4,5};
		
		// Advanced for loop / For each / Enahnced for..loop
		for(int value :  a) 
		{
			System.out.println(value);
		}
		
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println("A["+i+"] : " + a[i]);
//		}
		
			
			
			
//			int sum = 0;
//			System.out.println("a1.length : " + a1.length);
//			for(int i = 0 ; i < a1.length ; i++) 
//			{
//				System.out.println("Enter A["+ i +"] : ");
//				a1[i] = sc.nextInt();
//			}
//			for (int i = 0; i < a1.length; i++) 
//			{
//				for (int j = (i+1); j < a1.length; j++) 
//				{
//					if(a1[i] > a1[j]) 
//					{
//						int temp = a1[i];
//						a1[i] = a1[j];
//						a1[j] = temp;
//					}
//				}
//			}
//			for(int i = 0 ; i < a1.length ; i++) 
//			{
//				sum = sum + a1[i];
//				System.out.println("A["+ i +"] : " + a1[i]);
//			}
//			System.out.println("Sum of Array : " + sum);
			
//		----------------------------------------------
//			int []a2 = new int[5];
//		----------------------------------------------
//			int[] a3 = new int[5];
//		----------------------------------------------
//			int [] a4 = new int[5];
//		----------------------------------------------
//			int a5[] = null;
//			a5 = new int[5];
//		----------------------------------------------

//		Array Declaration and Initialisation:-
//		-----------------------------------------

//			int a6[] = {1,2,3,4,5};

//			SOP(a6.length);// 5 SIZE
//		-----------------------------------------

//			int a7[] = new int[] {1,2,3,4,5};
//			a7[0]// 1
//			a7[1]// 2
//		-----------------------------------------


		
	}
}
