package collectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// TypeSafe---String
		ArrayList<String>listObj = new ArrayList<String>();
		
		listObj.add("Royal");
		listObj.add("ankur");
		listObj.add("sagar");
		listObj.add("brijesh");
		listObj.add("vansh");
		listObj.add("rahul");

		
		Iterator<String> itr = listObj.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
