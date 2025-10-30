package threadtopic.bythread.task2;

// resource
public class MyTable 
{
	// Threadsafe---synchronized
	public synchronized  void printTable(int no) 
	{
		for (int i = 1; i <=10; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(no+ " * " + i + " = " + (no*i)+"----"+Thread.currentThread().getName());
		}
	}
}
