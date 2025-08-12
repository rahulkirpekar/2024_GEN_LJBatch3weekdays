package stringtopic.mutable;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		
		String value  = "Java";
		
		String result = value.repeat(5);
		
		System.out.println(result);
		
		//				012345678901234567890
//		String stmt =  "This is Java which is Developed By James Gosling";
		
//		String no1Str = String.valueOf(10);
//		String no2Str = String.valueOf(20);
//		System.out.println(no1Str+no2Str);
		
		
		
//		byte b[] = stmt.getBytes();
//		for (int i = 0; i < b.length; i++) 
//		{
//			System.out.println(stmt.charAt(i)+"----"+b[i]);
//		}
		
//		char v[] = 	stmt.toCharArray();
//		for (int i = 0; i < v.length; i++) 
//		{
//			System.out.println("v["+i+"] : " + v[i]);
//		}
		
//		String words[] = stmt.split("\\s");
//		System.out.println("words.length : " + words.length);
//		for (String word : words) 
//		{
//			System.out.println(word);
//		}

//		System.out.println("stmt : " + stmt);
//		stmt = stmt.replace("is", "was");
//		System.out.println("stmt : " + stmt);
		
//		String value = name.substring(8);
//		String value = name.substring(8,12);
//		System.out.println("Value : " + value);
		
		
//		String name = " Royal "; // " Royal "
//		System.out.println("name.length() : " + name.length());// 5
//		name = name.trim();// royal
//		System.out.println("name.length() : " + name.length());// 5
		
		
		//			   01234567890	
//		String stmt = "This is Java which is ddeveloped by James Gosling";

		
//		String  value =	stmt.toUpperCase();//stmt.toLowerCase();
//		System.out.println("Lowercase value : " + value);
		
//		int index = stmt.indexOf("is");
//		int index = stmt.lastIndexOf("is");
		
//		System.out.println("index : " + index);
//		boolean flag = stmt.startsWith("xyz");// true/false
//		boolean flag = stmt.endsWith("is");// true/false
//		System.out.println("flag : " + flag);
		
//		System.out.println(stmt.contains("Xyz"));// true
//		String name1 = " h ";
//		System.out.println(name1.isBlank());// true
//		System.out.println(name1.isEmpty());// false
	}
}
/*
	1. length
	2. charAt
	3. startsWith
	4. endsWith
	5. equals
	6. equalIgnoreCase
	7. compareTo
	8. contains
	9. isBlank
	10.isEmpty
	11. indexof
	12. lastIndexOf
	13. append(StringBuilder/StringBuffer)
	14. concat(String)
	15. toLowerCase
	16. toUpperCase	
	17. trim
	18. substring with single arg
	19. substring with Multiple arg
	20. replace
	21. split
	22. toCharArray[string convert into char array]
	23. getBytes 
	24. String.valueOf(10);// To convert any type value into String type.
	25. repeat--To repeat string multiple times and return.
	
	Link for Practise of String 
	https://docs.google.com/document/d/1rofXts5k_9gA6s13sgnZ8JUW_zbK4h2scYSCSOVCMpQ/edit?usp=sharing
*/