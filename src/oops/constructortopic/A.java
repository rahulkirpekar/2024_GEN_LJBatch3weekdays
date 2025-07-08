package oops.constructortopic;

// ways to use of this keyword
//-----------------------------------
// 1. this.
// 2. this -- object access--Non-static method --[this]
// 3. this()--constructor

public class A 
{
	int no1,no2,no3;
	public A()
	{
		System.out.println("Default Constructor-----" + this);
	}
	public A(int no1)
	{
		this();
		System.out.println("One--Args--Para Constructor-----" + this);
		this.no1 = no1;
	}
	public A(int no1,int no2)
	{
		this(no1);
		System.out.println("Two--args--Para Constructor-----" + this);
		this.no2 = no2;
	}
	public A(int no1,int no2,int no3)
	{
		this(no1,no2);
		System.out.println("Three--args--Para Constructor-----" + this);
		this.no3 = no3;
	}
	public void dispData() 
	{
		System.out.println(no1+" " + no2+" " + no3+"------"+this);
	}
	public static void main(String[] args) 
	{
		A obj1 = new A(10,20,30);// no1 no2 no3 no4
		A obj2 = new A(10,20,30);// no1 no2 no3 no4
		obj1.dispData();
		obj2.dispData();
	}
}