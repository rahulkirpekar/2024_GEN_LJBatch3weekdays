package collectionfrmwrk.list;

import java.util.Iterator;
import java.util.Vector;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		// ArrayList--data--store--display
		// LinkedList--data---operation[insert,update,delete,sorting,search]
		// Vector--[MultiThreadding]---Threadsafe---[synchronized]--all methods
		
		Vector<String> list = new Vector<>();
		
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
