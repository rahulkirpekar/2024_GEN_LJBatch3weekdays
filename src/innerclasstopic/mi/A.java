package innerclasstopic.mi;

public class A 
{
	// Data Member
	private int no = 1000;

	// Member Innerclass
	class B
	{
		void show() 
		{
			System.out.println("B---No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B objB = objA.new B();
		
		objB.show();
	}
}
