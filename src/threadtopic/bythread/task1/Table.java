package threadtopic.bythread.task1;

// resource class
public class Table 
{
	// resource
	public void printTable(int no) 
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
			System.out.println(no+" * " + i +" = " + (no*i) +"----"+Thread.currentThread().getName());
		}
	}
}
