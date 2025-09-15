package collectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApplication 
{
	public static void main(String[] args) 
	{
		int rno = 0,i;
		ArrayList<Student> list = new ArrayList<Student>();
		Student s = null;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do 
		{
			System.out.println("Enter below chocie : ");
			System.out.println("1) For Insert Student");
			System.out.println("2) For Update Student");
			System.out.println("3) For Delete Student");
			System.out.println("4) For Search Student By Rno");
			System.out.println("5) For Display All Records");
			System.out.println("6) For Exit Application");
			choice = sc.nextInt();

			switch(choice) 
			{
				case 1: s = new Student();
						s.scanData();						
						list.add(s);	
						System.out.println("Student record succssfully Inserted.");
						break;
						
				case 2: System.out.println("Enter Rno Which you want to Update : ");
						rno = sc.nextInt();
						flag= false;
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							if (s.getRno()==rno) 
							{
								flag= true;
								break;
							}
						}
						if(flag) 
						{
							s = list.get(i);
							s.updateData();
							list.set(i, s);
							System.out.println("Student record suuccessfully Updated.");
						}else 
						{
							System.out.println(rno + " rno not found in Student records.");	
						}
						
						break;
						
				case 3:	System.out.println("Enter Rno Which you want to remove : ");
						rno = sc.nextInt();
						flag= true;
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							if (s.getRno()==rno) 
							{
								list.remove(i);
								System.out.println("Student record succssfully Removed.");
								flag= false;
								break;
							}
						}
						if(flag) 
						{
							System.out.println(rno + " rno not found in Student records.");	
						}
						break;
						
				case 4: System.out.println("Enter Rno  Which you want to Search : ");
						int searchRno = sc.nextInt();
						flag= true;
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							if (s.getRno()==searchRno) 
							{
								s.dispData();
								flag= false;
								break;
							}
						}
						if(flag) 
						{
							System.out.println(searchRno + " rno not found in Data.");
						}
						break;
				case 5: System.out.println("Student Records");
						for ( i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							s.dispData();
						}
						break;
						
				case 6: 
						System.out.println("Application will bet exit");
						try 
						{
							Thread.sleep(1000);
						} catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						break;
			}
		}while(choice != 6);
	}
}
