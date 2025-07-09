package oops.inhtopic.sinh;
public class B extends A
{
	int no2;
	public B() 
	{
		super(100);
		System.out.println("B : Default Constructor");
	}
	public B(int no1) 
	{
		System.out.println("B(int no1)  : Para Constructor");
	}
	public B(int no1,int no2) 
	{
//		super(no1);
		System.out.println("B(int no1,int no2)  : Para Constructor");
		this.no2=no2;
	}
}
