package string;

public class ToUpperCase {

	public static void main(String[] args) {
		
		String s="abZrcd";
		
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				char ch=(char)(s.charAt(i)-32);
				s1=s1+ch;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		

	}

}
