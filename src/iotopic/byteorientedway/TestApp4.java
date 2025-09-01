package iotopic.byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Student s =new Student(1, "Rahul", 12,90);
		try 
		{
			FileOutputStream  fout = new FileOutputStream("royallist.txt");
			
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s);
			
			System.out.println("Success");
			
			out.close();
			fout.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
