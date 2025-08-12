package stringtopic.immutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name = "Royal";
		
		System.out.println(name+"---"+name.hashCode());

		// Immutable 
		name = name.concat("Techno");// RoyalTechno
		
		System.out.println(name+"---"+name.hashCode());
	}
}
