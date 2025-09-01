package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2024_GEN_LJBatch3weekdays\\list.txt");

			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s[] = (Student[])oin.readObject();
		
			for (int i = 0; i < s.length; i++) 
			{
				s[i].dispData();
			}
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
