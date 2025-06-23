package arrayytopic.backuparray;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int a[][]  = new int[3][3];
		
		int [][]a1  = new int[3][3];
		
		int[][] a2  = new int[3][3];
		
		int [][] a3  = new int[3][3];
		
		int []a4[]  = new int[3][3];
		
		int a5[][]  = null;
		a = new int[3][3];
		
		
		int a6[][]  = {{1,2,3} ,{4,5,6} , {7,8,9}};
		
		int []a7[]  = new int[3][];
		

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = new Scanner(System.in).nextInt();
			} 
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+"\t");
			} 
			System.out.println(); 
		}
	}
}
