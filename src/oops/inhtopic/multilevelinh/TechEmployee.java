package oops.inhtopic.multilevelinh;

// MultiLevel Inheritance
public class TechEmployee extends Employee
{
	String task;
	
	public TechEmployee() 
	{
	}
	public TechEmployee(int id, String name,int salary, String dsgn,String task) 
	{
		super(id, name, salary, dsgn);
		this.task = task;
	}
	
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + task);
	}
	
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee(1, "Rahul", 1220, "SE", "App Dev");

		techEmp.dispData();
	}
}
