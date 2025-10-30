package jdbctopic.prishabackupjdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.prishabackupjdbc.util.DBConnection;

public class StudentDao 
{
	public int insertStudent(StudentBean s) 
	{
		int rowsAffected = 0;
		String insertQuery = "INSERT INTO Student (name,std,marks) VALUES ('"+s.getName()+"',"+s.getStd()+","+s.getMarks()+")";
		
		System.out.println("insertQuery : " + insertQuery);
		
		Statement stmt = null;
		
		// 1. getconnection
		Connection conn = DBConnection.getConnection();
		
		// 2. verifiy connection
		if (conn != null ) 
		{
			try 
			{
				// 3. create statement object
				stmt = conn.createStatement();
				
				// 4. query execute
				rowsAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao---Db not connected");
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
		
		// ------------------INSERT Student-----------------
		System.out.println("Enter Name : ");
		String name = sc.nextLine(); 
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean s = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(s);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record sucessfully Inserted : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
	}
}
