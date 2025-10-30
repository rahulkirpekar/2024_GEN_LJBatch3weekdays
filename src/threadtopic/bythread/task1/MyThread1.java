package threadtopic.bythread.task1;

public class MyThread1 extends Thread
{
	Table resource = null;
	
	public MyThread1(Table resource) 
	{
		this.resource = resource;
	}
	
	@Override
	public void run() 
	{
		resource.printTable(10);
	}
}
