package oops.inhtopic.multilevel;

public class ManagementEmployee extends Employee
{
	String projectAllocation;
	
	public ManagementEmployee() 
	{
	}
	public ManagementEmployee(int id, String name,int salary, String dsgn,String projectAllocation) 
	{
		super(id, name, salary, dsgn);
		this.projectAllocation = projectAllocation;
	}
	
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + projectAllocation);
	}
}
