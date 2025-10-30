package threadtopic.byrunnable;

public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
//		System.out.println("Hi I am Thread : " + Thread.currentThread().getName());
		
		for (int i = 1; i <=10; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(5+" * " + i + " = " + (5*i) +"-----"+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) 
	{
		MyThread1 obj1 = new MyThread1();
		MyThread1 obj2 = new MyThread1();
		MyThread1 obj3 = new MyThread1();
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		Thread thread3 = new Thread(obj3);
		
		thread1.start();// Thread class
		thread2.start();// Thread class
		thread3.start();// Thread class
	}
}
