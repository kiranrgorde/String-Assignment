package string;

public class PalindromeString {

	public static void main(String[] args)
	{
		String s="abcban";
		
		String s1="";
		
		for (int i = s.length()-1; i >=0; i--)
		{
			s1+=s.charAt(i);
			
		}
		
		if(s.equals(s1))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("not palindrome string");
		}

	}

}
