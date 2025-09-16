package collectionfrmwrk.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("rahul");
		list.add("ankur");
		list.add("brijesh");
		list.add("ravi");
		list.add("sagar");
		list.add("sujal");
		list.add("kunal");
		
		Iterator<String> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
