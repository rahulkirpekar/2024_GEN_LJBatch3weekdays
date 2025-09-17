package collectionfrmwrk.map;

import java.util.HashMap;
import java.util.Map;

public class TestAppp1 
{
	public static void main(String[] args) 
	{
// 		HashMap---Not Maintain Insertion order--Key
		HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
//------------------------------------------------------------------------------		
// 		LinkedHashMap---Maintain Insertion order--Key
//		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<Integer, String>();
//------------------------------------------------------------------------------		
		// TreeMap---Ascending order Sorting --Key
//		TreeMap<Integer, String> mapObj = new TreeMap<Integer, String>();
		
		// Key,Value---Data---Entry
		mapObj.put(11, "Ganesh");// Key,Value---Entry
		mapObj.put(32, "Kunal");
		mapObj.put(3, "Sagar");
		mapObj.put(14, "Vidhi");
		mapObj.put(2, "Ankur");
		
		for( Map.Entry<Integer, String> e  : mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+"---"+e.getValue());
		}
	}
}
