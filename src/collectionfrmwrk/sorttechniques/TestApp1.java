package collectionfrmwrk.sorttechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// List		Set			Queue			Map
		//  -       TreeSet 	  PriorityQueue		TreeMap
		//  |
		// Collections.sort(list);
		
		// Collection(I)--Interface
		// Collections(C)--sorting
		
		ArrayList<Integer>listObj = new ArrayList<Integer>();
		
		listObj.add(10);
		listObj.add(67);
		listObj.add(23);
		listObj.add(98);
		listObj.add(34);
		listObj.add(67);
		
		Iterator<Integer> itr = listObj.iterator();
		
		while(itr.hasNext()) 
		{
			int value = itr.next();
			System.out.println(value);
		}
		System.out.println("-------------------------------------------");

		Collections.sort(listObj);
		
		itr = listObj.iterator();
		
		while(itr.hasNext()) 
		{
			int value = itr.next();
			System.out.println(value);
		}
	}
}
