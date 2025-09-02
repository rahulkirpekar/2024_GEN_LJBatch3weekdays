package innerclasstopic.ni;

public class A 
{
	static int no = 2000;

	// Nested Innerclass
	static class B
	{
		void show() 
		{
			System.out.println("NO : " + no);
		}
	}
	
	public static void main(String[] args) 
	{
		// Nested class
		A.B obj = new A.B();
		
		obj.show();
	}
}
