package oops.abstopic.aclass;

// 0% to 100%
public abstract class A 
{
	// 1. Data Members
	int no1;
	// 2. Methods
	
		//1. Abstract Methods--"Abstraction"
		abstract void addFun(int no1,int no2);
	
		//2. Non-Abstract Methods
		void test1() 
		{
			
		}
		static void test2() 
		{
			
		}
	// 3. constructors
		public A() 
		{
			System.out.println("A--default constructor");
			no1=100;
		}
}
