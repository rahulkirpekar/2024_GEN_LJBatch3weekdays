package stringtopic.mutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		StringBuilder sb = new StringBuilder("Royal");
		StringBuffer sb = new StringBuffer("Royal");
		
		System.out.println(sb+"---"+sb.hashCode());
		
		// Mutable Behaviour
		sb.append("Techno");// RoyalTechno
		
		
		System.out.println(sb+"---"+sb.hashCode());
	}
}
