package innerclasstopic.mi.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Anonymous Innerclass
		A obj = new A() 
		{
			@Override
			public int addFun(int no1, int no2) 
			{
				return (no1+no2);
			}
		};
		
		int ans = obj.addFun(20, 10);
		System.out.println("Addition : " + ans);
	}
}
