package oops.abstopic.interfacetopic;

public  interface Person 
{
	public abstract void getBehave();
	
	
	public static void test1() 
	{
		System.out.println("Person---static---test1()");
	}
	default void test2() 
	{
		System.out.println("Person---default---test2()");
		test3();
	}
	private  void test3() 
	{
		System.out.println("Person---private---test3()");
	}
}
