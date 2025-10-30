package threadtopic.bythread;

public class MyThread1 extends Thread
{
	// Thread---job---run()
	@Override
	public void run() 
	{
//		System.out.println("Hi I am Thread---run() Job Function : " + Thread.currentThread().getId() +"----" + Thread.currentThread().getName());

		for(int i= 1 ; i <5 ; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("I : " + i+"----"+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Function : " + Thread.currentThread().getName());

		MyThread1 thread1 = new MyThread1();
		MyThread1 thread2 = new MyThread1();
		MyThread1 thread3 = new MyThread1();
		MyThread1 thread4 = new MyThread1();
			
		thread1.setName("C Language");
		thread2.setName("C++ Language");
		thread3.setName("Java Language");
		thread4.setName("Python Language");
		
		thread1.setPriority(Thread.MAX_PRIORITY);// 10---Highest

		thread1.start();
		
		try 
		{
//			thread1.join();
			thread1.join(1500);// thread1---4 second
			
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
//		thread1.start();//Exception in thread "main" java.lang.IllegalThreadStateException
		
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
