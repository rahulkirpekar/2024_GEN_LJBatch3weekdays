package threadtopic.bythread.task2;

public class MyThread3 extends Thread
{
	MyTable resource;
	
	public MyThread3(MyTable resource) 
	{
		this.resource = resource;
	}
	
	@Override
	public void run() 
	{
		resource.printTable(15);
	}
}
