package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2024_GEN_LJBatch3weekdays\\royallist.txt");

			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Student s = (Student)oin.readObject();
		
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());

			
			oin.close();
			fin.close();
			
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
