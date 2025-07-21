package oops.finaltopic.localvar;

public class TestAppp1 
{
	public static void main(String[] args) 
	{
		final int no1;
		
		no1 = 10;
		
		System.out.println("No1 : " + no1);
		
		// Compiletime Error
		no1 = 10;
		
		System.out.println("No1 : " + no1);
	}

}
