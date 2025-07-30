package oops.abstopic.interfacetopic;

public interface A 
{
	int NO1 = 10;// public static final

	public void test1();// public abstract
	
	static void testStatic() 
	{
		System.out.println("testStatic()");
	}
	default void testDefault() 
	{
		testPrivate();	
		System.out.println("Default method---testDefault()");
	}
	private void testPrivate() 
	{
		
	}
}
