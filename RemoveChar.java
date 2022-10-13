package string;

public class RemoveChar {

	public static void main(String[] args) 
	{
		String s="abcfsfafgfasdg";
		String s1="";
		char ch='a';
		
		
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				continue;
			}
			else
			{
				s1+=s.charAt(i);
			}
		}
		
		System.out.println(s1);
		

	}

}
