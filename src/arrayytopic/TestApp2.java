package arrayytopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		String words[] = {"abc","xyz" , "kunal" , "ankur","sagar"};
		
		String words[] = new String[] {"abc","xyz" , "kunal" , "ankur","sagar"};

		for(int i = 0 ; i < words.length;i++) 
		{
			System.out.println("words["+i+"] : "  + words[i]);
		}
	}
}
