package collectionfrmwrk.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		/*	
		 * [primitive][Wraapper]
		 * [datatype ][ class]
		 *    |			|
		 * 	boolean---Boolean
		 *  byte------Byte
		 *  char------Character
		 *  short-----Short
		 * 	int-------Integer
		 *  long------Long
		 *  float-----Float
		 *  double----Double
		 * */
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
	}
}