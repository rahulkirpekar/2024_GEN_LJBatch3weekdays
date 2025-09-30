package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.util.DBConnection;

//  Statement
//    |
// StudentDao---Student Table
public class StudentDao 
{
	public int insertStudent(String name,int std,int marks) 
	{
		int rowsAffected = 0 ;
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+ name +"',"+ std +","+ marks +")";
		
		// 1. get Db Connection
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		
		// 2. validate conn object
		if (conn != null) 
		{
			try 
			{
				// 3. create statement object
				stmt = conn.createStatement();
				
				// 4. execute SQL query
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao-----insertStudent() ----Db not connected");
		}
		return rowsAffected;
	}
	public void updateStudent() 
	{

	}
	public void deleteStudent() 
	{

	}
	public void getAllRecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(name, std, marks);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
	}
}