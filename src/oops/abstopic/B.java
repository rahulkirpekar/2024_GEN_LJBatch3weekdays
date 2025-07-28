package oops.abstopic;

public class B extends A
{
	int no2;
	public B()
	{
		System.out.println("B--default constructor");
		no2=200;
	}
	@Override
	void addFun(int no1, int no2) 
	{
		System.out.println("B---addFun(int no1,int no2) : " + (no1+no2));
	}
	
	public static void main(String[] args) 
	{
		A.test2();
		B obj = new B();
		obj.addFun(10, 20);

		B objB = new B();
		
		System.out.println(objB.no1+" " + objB.no2);
	}
}
