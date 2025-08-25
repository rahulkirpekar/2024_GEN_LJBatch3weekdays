package exceptiontopic;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		// finally Block
		
		try 
		{
			System.out.println(10/0);
		} catch (NullPointerException e) 
		{
			System.out.println(" I am Catch Block");
		}
		finally 
		{
			System.out.println(" I am Finally Block");
		}
		
		System.out.println("After try..catch");
		
		
		
	}
}
