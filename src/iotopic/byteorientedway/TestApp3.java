package iotopic.byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		//  read(data)--write
		//			      |	
		// TestApp2---->Duplicate.java
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\2024_GEN_LJBatch3weekdays\\src\\iotopic\\byteorientedway\\TestApp2.java");

			FileOutputStream fout = new FileOutputStream("Duplicate.java");
			
			int temp;
			
			while ( (temp = fin.read()) != -1) 
			{
				char c = (char)temp;
				System.out.print(c);
				
				fout.write(temp);
			}
			
			fout.close();
			fin.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
