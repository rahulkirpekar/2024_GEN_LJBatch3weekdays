package oops.inhtopic.multilevel;

public class Employee extends Person
{
	int id,salary;
	String dsgn;
	
	public Employee() 
	{
	}
	public Employee(int id, String name,int salary, String dsgn) 
	{
		super(name);
		this.id = id;
		this.salary = salary;
		this.dsgn = dsgn;
	}
	
	
}
