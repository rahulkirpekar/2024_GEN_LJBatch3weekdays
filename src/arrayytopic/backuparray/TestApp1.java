package arrayytopic.backuparray;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		98% --Array as Object
		
		int a[] = new int[5];//a[0],a[1],a[2],a[3],a[4]
		
		int []a1 = new int[5];//a[0],a[1],a[2],a[3],a[4]
		
		int[] a2 = new int[5];//a[0],a[1],a[2],a[3],a[4]
		
		int [] a3 = new int[5];//a[0],a[1],a[2],a[3],a[4]
		
		int [] a4 = new int[] {10,20,30,40,50};
		
		int [] a5 = null;
		a5 = new int[] {10,20,30,40,50};
		
		int [] a6 = null;
		a6 = new int[5];
		
		
		System.out.println("a.length : " + a.length);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}
