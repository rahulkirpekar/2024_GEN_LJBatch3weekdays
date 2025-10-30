package threadtopic.bythread.task2;

public class MyThread1 extends Thread
{
	MyTable resource;
	
	public MyThread1(MyTable resource) 
	{
		this.resource = resource;
	}
	@Override
	public void run() 
	{
		resource.printTable(5);
	}
}
