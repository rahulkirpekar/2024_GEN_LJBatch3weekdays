package oops.basic;

public class TestApp1 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
//		String name = "rahul";
//		System.out.println(name.toString());
	
//		Student s = new Student();
		
		Student s= (Student)Class.forName("oops.Student").newInstance();
		
		System.out.println("s ==>"+s);
		System.out.println("s.toString ==>"+s.toString());
	}
}
