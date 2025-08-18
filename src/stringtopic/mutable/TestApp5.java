package stringtopic.mutable;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		/*
			String		StringBuilder/StringBuffer
			concat------>append
			  X--------->reverse
		
		
		*/
//		StringBuilder sb = new StringBuilder("Royal");
		StringBuffer sb = new StringBuffer("Royal");
		
		System.out.println(sb+"--"+sb.hashCode());
		
		sb.append(" techno");
		System.out.println(sb+"--"+sb.hashCode());
	}
}
