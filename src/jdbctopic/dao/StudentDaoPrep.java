package jdbctopic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

//  PreparedStatement
//     |
// StudentDaoPrep 
public class StudentDaoPrep 
{
	public int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0 ;
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES (?,?,?)";
		Connection conn =	DBConnection.getConnection();
		PreparedStatement pstmt = null;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
			
				pstmt.setString(1, sbean.getName());	
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				

				System.out.println("pstmt : " + pstmt);
				
				rowsAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep----insertStudent() Db not connected");
		}
		return rowsAffected;
	}
	public int updateStudent(StudentBean sbean,int rno) 
	{
		String updateQuery = "UPDATE student SET name=?,std=?,marks=? WHERE rno = ?";

		System.out.println("updateQuery : " + updateQuery); 
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt= null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt= conn.prepareStatement(updateQuery);
			
				pstmt.setString(1, sbean.getName());
				pstmt.setInt(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				pstmt.setInt(4, rno);
				
				rowsAffected = pstmt.executeUpdate();
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---updateStudent() Db not connected");
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllRecords() 
	{
		String selectQuery = "SELECT * from student"; 
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt =null;
		ResultSet rs =	null;
		StudentBean sbean = null;
		
		ArrayList<StudentBean> list = new ArrayList<StudentBean>();
		
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
			
				rs = pstmt.executeQuery();
				
				while(rs.next()) 
				{
					int rno 	= 	rs.getInt(1);
					String name =   rs.getString(2);
					int std 	= 	rs.getInt(3);
					int marks 	= 	rs.getInt(4);
					
					sbean = new StudentBean(rno, name, std, marks);
					
					list.add(sbean);
				}
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudntDaoPrep--getAllRecords()---Db not connected");
		}
		return list;
	}
	public int deleteStudent(int rno) 
	{				
		
		String deleteQuery = "DELETE FROM student WHERE rno = ?";

		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt= null;
		
		int rowsAffected = 0 ;
		
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
				
				pstmt.setInt(1, rno);
				
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---deleteStudent()--DB not connected");
		}
		return rowsAffected;
	}
	public static void main(String[] args) 
	{
		StudentDaoPrep dao = new StudentDaoPrep();
		
		ArrayList<StudentBean> list = dao.getAllRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}

		
/*		Scanner sc = new Scanner(System.in);
		//-----------DELETE STUDENT-----------------------		
		System.out.println("Enter Rno Which you want to Delete student record : ");
		int rno = sc.nextInt();
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Deleted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
		
		//-----------UPDATE STUNDET-----------------------		

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
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record succssfully Updated : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
				
		//-----------INSERT STUNDET-----------------------		

		System.out.println("Enter Name : ");
		String name= sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao = new StudentDaoPrep();
		
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
