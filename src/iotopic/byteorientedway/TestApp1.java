package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// Byte oriented way---write
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name=  sc.nextLine();
		
		// string--name---->byte---write---file
		byte b[] = name.getBytes();// A--65
		try 
		{
			FileOutputStream  fout = new FileOutputStream("list.txt");
			
			fout.write(b);
			
			fout.close();

			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}





