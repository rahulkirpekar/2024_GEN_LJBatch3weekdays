package oops.constructortopic;

public class Employee 
{
	int id;
	String name;
	int salary;
	String dsgn;
	String dept;
	String projectAllocate;

	public Employee() 
	{
		System.out.println("Default Constructor");
	}
	public Employee(int id, String name, int salary) 
	{
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, int salary, String dsgn) 
	{
		this(id, name, salary);
		this.dsgn = dsgn;
	}

	public Employee(int id, String name, int salary, String dsgn, String dept) 
	{
		this(id, name, salary, dsgn);
		this.dept = dept;
	}

	public Employee(int id, String name, int salary, String dsgn, String dept, String projectAllocate) 
	{
		this(id, name, salary, dsgn, dept);
		this.projectAllocate = projectAllocate;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + dsgn+" " + dept+" " + projectAllocate);
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee(1, "Rahul", 1000, "SE", "Mobile", "Abc");
		e.dispData();
	}
}
