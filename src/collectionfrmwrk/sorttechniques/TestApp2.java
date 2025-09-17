package collectionfrmwrk.sorttechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		ArrayList<String> list = new ArrayList<String>();
		ArrayList list = new ArrayList();
		
		list.add("rahul");
		list.add("ankur");
		list.add("brijesh");
		list.add("ravi");
		list.add(10);
		list.add("sagar");
		list.add("sujal");
		list.add("kunal");
		
		Iterator itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}

		System.out.println("--------------------------------------");
		Collections.sort(list);// ClasscastException
		
		itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	} 
}
