package collectionfrmwrk.queue;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("royal");
		queue.add("ankur");
		queue.add("sagar");
		queue.add("brijesh");
		queue.add("vansh");
		queue.add("rahul");

		
		while(!queue.isEmpty()) 
		{
			String name  = queue.poll();
			System.out.println(name);
		}
	}
}
