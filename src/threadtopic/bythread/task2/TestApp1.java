package threadtopic.bythread.task2;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		MyTable resource = new MyTable();
		
		MyThread1 t1 = new MyThread1(resource);
		MyThread2 t2 = new MyThread2(resource);
		MyThread3 t3 = new MyThread3(resource);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

/*
 * 
 * Bank Application
 * ----------------
 * 
 * 			mainBalance(0/-)
 * 				|
 * Threadsafe--withdraw(resource)
 * 				|
 * 			Combined Account(10,000)
 * 				|
 * 			----------
 * 			|		|
 * 			A		B
 * 		  (10K)	    (10K)----20K	
 * 			|
 * 		  (10k)
 * 
 * 
 */
