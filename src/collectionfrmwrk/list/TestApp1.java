package collectionfrmwrk.list;

import java.util.ArrayList;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listObj = new ArrayList();
		
		listObj.add(10);// 0--int----->WrapperClass(Integer)--10--Object---[Auto Boxing]
		listObj.add(true);//1
		listObj.add('R');//2
		listObj.add(12.2134f);//3
		listObj.add(76654.243);//4
		listObj.add(144L);//5
		listObj.add("Royal");//6
		
		Student s1 = new Student(1, "Rahul", 12, 90);
		listObj.add(s1);//7

		System.out.println("listObj.size() : " + listObj.size());// 8 size
		
		
//		System.out.println("listObj.get(0) : " + listObj.get(4));
		
		// for loop --iteration
		for (int i = 0; i < listObj.size(); i++) 
		{
			Object obj	= listObj.get(i);
			
			if (obj instanceof Student) 
			{
				Student s = (Student)obj;
				System.out.println("listObj.get("+i+") : " + s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
			} else 
			{
				System.out.println("listObj.get("+i+") : " + obj.toString());
			}
		}
	}
}
