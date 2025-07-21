package oops.polymorphism.cp;

// Method Overloadding 
public class Calc 
{
	static void addFun(float no1,float no2)
	{
		System.out.println("Calc(Two args--float)---Sum : " + (no1+no2));
	}
	static void addFun(double no1,double no2)
	{
		System.out.println("Calc(Two args--double )---Sum : " + (no1+no2));
	}
	static void addFun(int no1,int no2,int no3)
	{
		System.out.println("Calc(Three args)---Sum : " + (no1+no2+no3));
	}
	static void addFun(int no1,int no2,int no3,int no4)
	{
		System.out.println("Calc(Four args)---Sum : " + (no1+no2+no3+no4));
	}
	public static void main(String[] args) 
	{
		Calc.addFun('A', 'B');
		
	}
}
/*
	1. argument count
	2. datatype match
	3. Type-pramotion rule



Type Pramotion Rule:--
-----------------------	

	boolean---X
	
					byte
					 |
					short
					 |
char--------------->int 
					 |
				    long	 
					 |
				    float
					 |
				   double
 	












 
*/