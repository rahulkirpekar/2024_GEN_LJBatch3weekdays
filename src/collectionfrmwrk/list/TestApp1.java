package collectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listObj = new ArrayList();
		
		listObj.add(10);// 0      --int----->WrapperClass(Integer)--10--Object---[Auto Boxing]
		listObj.add(true);//1 <==itr
		listObj.add('R');//2
		listObj.add(12.2134f);//3
		listObj.add(76654.243);//4
		listObj.add(144L);//5
		listObj.add("Royal");//6
		
		Student s1 = new Student(1, "Rahul", 12, 90);
		listObj.add(s1);//7

		System.out.println("listObj.size() : " + listObj.size());// 8 size

		
		Object obj [] = 	listObj.toArray();
		
		for (int i = 0; i < obj.length; i++)
		{
			System.out.println(obj[i]);
		}
		

//		for (int i = 0; i < listObj.size(); i++) 
//		{
//			Object obj	= listObj.get(i);
//			
//			if (obj instanceof Student) 
//			{
//				Student s = (Student)obj;
//				System.out.println("listObj.get("+i+") : " + s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
//			} else 
//			{
//				System.out.println("listObj.get("+i+") : " + obj.toString());
//			}
//		}
		// Update
//		listObj.set(2, "Ankur");
		
		//remove
//		listObj.remove(2);
//		listObj.remove("Royal");

		
		// clear list
//		listObj.clear();
		
//		System.out.println("-------------------------------------");
//		System.out.println("listObj.size() : " + listObj.size());
		
//		for (int i = 0; i < listObj.size(); i++) 
//		{
//			Object obj	= listObj.get(i);
//			
//			if (obj instanceof Student) 
//			{
//				Student s = (Student)obj;
//				System.out.println("listObj.get("+i+") : " + s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
//			} else 
//			{
//				System.out.println("listObj.get("+i+") : " + obj.toString());
//			}
//		}

		
/*
		char value = (char)listObj.get(2);
		System.out.println("value : " + value);
		// Add Element
		
//		1. add(Object)
//		2. add(Index , Object)
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
		listObj.add(3, "Ganesh");
		System.out.println("-------------------------------------");
		
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
*/		
		
		
//		System.out.println("listObj.get(0) : " + listObj.get(4));

/*		
		// 1. for loop --iteration
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
		------------------------------------------------------------------
		// 2. Advanced for loop  / Enhanced for loop / For each loop
		for( Object obj : listObj) 
		{
			if (obj instanceof Student) 
			{
				Student s = (Student)obj;
				System.out.println("==> " + s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
			} else 
			{
				System.out.println(obj);
			}
		}
		------------------------------------------------------------------
		// 3. By Iteratorway
		-----------------------
		Iterator itr =	listObj.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				Student s = (Student )obj;
				System.out.println("==> " + s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
			} else 
			{
				System.out.println(obj);
			}
		}
		------------------------------------------------------------------
		// 4. By Iteratorway
		-----------------------
		
		ListIterator itr =	listObj.listIterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			
			if (obj instanceof Student) 
			{
				Student s = (Student )obj;
				System.out.println("==> " + s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
			} else 
			{
				System.out.println(obj);
			}
		}
		System.out.println("----------------------------------------------");
		while(itr.hasPrevious()) 
		{
			Object obj = itr.previous();
			
			if (obj instanceof Student) 
			{
				Student s = (Student )obj;
				System.out.println("==> " + s.getRno()+" "+s.getName()+" " + s.getStd()+" " + s.getMarks());
			} else 
			{
				System.out.println(obj);
			}
		}		

		
*/
	}
}