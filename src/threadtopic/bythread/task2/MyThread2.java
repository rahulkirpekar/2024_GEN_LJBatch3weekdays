package threadtopic.bythread.task2;

public class MyThread2 extends Thread
{
	MyTable resource;
	
	public MyThread2(MyTable resource) 
	{
		this.resource = resource;
	}
	
	@Override
	public void run() 
	{
		resource.printTable(10);
	}
}
