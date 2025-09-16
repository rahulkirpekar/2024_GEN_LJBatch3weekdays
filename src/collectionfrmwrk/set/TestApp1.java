package collectionfrmwrk.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// set---remove ---[duplicate values]
		
		// HashSet---Not Maintain Insertion order
		// LinkedHashSet---Maintain Insertion order
		// TreeSet---Ascensing Order Sorting
		
//		HashSet<String> setObj = new HashSet<>();
//		LinkedHashSet<String> setObj = new LinkedHashSet<>();
		TreeSet<String> setObj = new TreeSet<>();
		
		setObj.add("rahul");
		setObj.add("ankur");
		setObj.add("brijesh");
		setObj.add("ravi");
		setObj.add("sagar");
		setObj.add("ankur");
		setObj.add("brijesh");
		setObj.add("sujal");
		setObj.add("kunal");
		
		Iterator<String> itr =	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
