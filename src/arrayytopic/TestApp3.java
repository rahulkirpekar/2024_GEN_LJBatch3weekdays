package arrayytopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
//		int a1[][] = new int[3][3];
//		int [][]a2 = new int[3][3];
//		int[][] a3 = new int[3][3];
//		int [][] a4 = new int[3][3];
//		int []a5[]  = new int[3][3];

		Scanner sc = new Scanner(System.in);
		
		// Jagged Array
		int []a6[]  = new int[3][];
		
		a6[0] = new int[3];//a[0][0],a[0][1],a[0][2] = a[0].length = 3
		a6[1] = new int[4];//a[1][0],a[1][1],a[1][2],a[1][3] = a[1].length = 4
		a6[2] = new int[2];//a[1][0],a[1][1] = a[2].length = 2

		// Student---3
		for (int i = 0; i < a6.length; i++) 
		{
			// Subjects---different
			for (int j = 0; j < a6[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a6[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a6.length; i++) 
		{
			// Subjects---different
			for (int j = 0; j < a6[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a6[i][j]);
			}
		}
		
		
		
		
		

//		int a7[][]  = new int[][] { {1,2,3}, {4,5,6}, {7,8,9}};

		
		
	}
}
