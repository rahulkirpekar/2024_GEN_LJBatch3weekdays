package collectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list  = new ArrayList<Student>();

		Student s1= new Student(1, "Ankur", 12, 90);
		Student s2= new Student(2, "Rakesh", 5, 70);
		Student s3= new Student(3, "Brijesh", 11, 30);
		Student s4= new Student(4, "sagar", 10, 80);
		Student s5= new Student(5, "Kunal", 9, 20);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Iterator<Student> itr = 	list.iterator();
		
		while (itr.hasNext()) 
		{
			Student s = itr.next();
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
	}
}


