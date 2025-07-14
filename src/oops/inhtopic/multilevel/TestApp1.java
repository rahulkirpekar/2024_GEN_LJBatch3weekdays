package oops.inhtopic.multilevel;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee(1, "Rahul", 1220, "SE", "App Dev");
		techEmp.dispData();
		
		ManagementEmployee manageEmp = new ManagementEmployee(1, "Rahul", 1220, "SE", "Qatar");
		manageEmp.dispData();
	}
}