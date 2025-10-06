package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

//  Statement
//    |
// StudentDao---Student Table
public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0 ;
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES ('"+ sbean.getName() +"',"+ sbean.getStd() +","+ sbean.getMarks() +")";
		
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
	public int updateStudent(StudentBean sbean,int rno) 
	{
		String updateQuery = "UPDATE student SET name='"+sbean.getName()+"',std="+sbean.getStd()+",marks="+sbean.getMarks()+" WHERE rno = "+rno;

		System.out.println("updateQuery : " + updateQuery); 
		
		Connection conn = DBConnection.getConnection();
		Statement stmt= null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt= conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---updateStudent() Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM student WHERE rno = " + rno;

		Connection conn = DBConnection.getConnection();
		
		Statement stmt= null;
		
		int rowsAffected = 0 ;
		
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---deleteStudent()--DB not connected");
		}
		return rowsAffected;
	}
	public void getAllRecords() 
	{

	}
	public static void main(String[] args) 
	{
		//-----------UPDATE STUNDET-----------------------	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Rno Which you want to Update student record : ");
		int rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		
		
/*		
		Scanner sc = new Scanner(System.in);
//-----------DELETE STUDENT-----------------------		
		System.out.println("Enter Rno Which you want to Delete student record : ");
		int rno = sc.nextInt();
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
//-----------INSERT STUNDET-----------------------		
		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
*/		
	}
}